package com.cse.iitj.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("v1/course")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/{courseId}")
    public ResponseEntity getCourseById(@PathVariable int courseId) {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", HttpStatus.OK);
        responseMap.put("Course", courseRepository.findById(courseId));
        return ResponseEntity.ok(responseMap);
    }

    @GetMapping("/courses")
    public ResponseEntity getAllCourses() {
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("status", HttpStatus.OK);
        responseMap.put("Course", courseRepository.findAll());
        return ResponseEntity.ok(responseMap);
    }
}
