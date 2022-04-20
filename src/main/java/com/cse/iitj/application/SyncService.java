package com.cse.iitj.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SyncService {

    private static HttpRestClient client = new HttpRestClient();

    private static Integer courseIndex = 0;

    @Autowired
    private AuditService auditService;

    private static final Logger LOGGER = LoggerFactory.getLogger(SyncService.class);

    @Autowired
    private CourseRepository repository;

    @Autowired
    private InstructorRepository instructorRepository;

    @Scheduled(fixedDelay = 10000)
    public void runSyncJob() {
        System.out.println("Inside SyncService.runSyncJob");
        LOGGER.info("Running Database Query");
        CourseResponse udemyResponse = null;
        List<Courses> listOfCourses = new ArrayList<>();
        List<Instructor> listOfInstructor = new ArrayList<>();
        try {
            for (int loop = 1; loop <= ApplicationConstants.MAX_PAGE_NUMBER; ++loop) {
                if (courseIndex >= ApplicationConstants.CATEGORY_SET.size()) {
                    courseIndex = 0;
                }
                String category = ApplicationConstants.CATEGORY_SET.get(courseIndex);
                auditService.createAuditLog("", "");
                udemyResponse = client.getCoursesData(category, ApplicationConstants.MAX_PAGE_SIZE, loop);
                auditService.createAuditLog("", "");
                if (udemyResponse != null) {
                    List<Result> results = udemyResponse.getResults();
                    for (Result result : results) {
                        Courses courses = new Courses();
                        courses.setCourseId(GeneratorUtil.courseIdGenerator());
                        courses.setTitle(result.getTitle());
                        courses.setCourseUrl(result.getUrl());
                        courses.setCategory(category);
                        listOfCourses.add(courses);
                        Instructor instructor = new Instructor();
                        instructor.setInstructorId(GeneratorUtil.instructorIdGenerator());
                        instructor.setJobTitle(result.getVisibleInstructors().get(0).getJobTitle());
                        instructor.setDisplayName(result.getVisibleInstructors().get(0).getDisplayName());
                        instructor.setUrl(result.getVisibleInstructors().get(0).getUrl());
                    }
                }
            }
            auditService.createAuditLog("", "");
            repository.saveAll(listOfCourses);
            instructorRepository.saveAll(listOfInstructor);
            auditService.createAuditLog("", "");
        } catch (Exception e) {
            auditService.createAuditLog("", "");
            e.printStackTrace();
        }
        courseIndex++;
        auditService.createAuditLog("", "");
    }

}