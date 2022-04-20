package com.cse.iitj.application;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * This class will call different third party APIs.
 *
 * @author Akhil Bhatia
 */
@Component
public class HttpRestClient {

    private static final String HOST_NAME = "https://www.udemy.com/api-2.0/courses/?";

    private RestTemplate restTemplate = new RestTemplate();

    public CourseResponse getCoursesData(String category, String pageSize, Integer page) {
        URI courseURL = null;
        courseURL = UriComponentsBuilder.fromUriString(HOST_NAME).query("category=" + category)
                .query("page_size=" + pageSize).query("page=" + page).build().toUri();
        HttpHeaders getHeaders = new HttpHeaders();
        HttpEntity requestParams = new HttpEntity(getHeaders);
        getHeaders.set("Authorization",
                "Basic QTZEYkhqenVhakMwQzRWZFdZd09xUjFKeUplNUtIT0trQmU2NTJ2ZDpZT2RISHhpOFVMQ1hSM0E1QlY1MVhOcG9hMTNNN25nOHFINDJKanZXNnFWNTNpRHRJS2lLY1N2bERhU0hjakdwbjZxZlpra1FEaXVRdFh3UWJBTTFxU3NGVXd5YzBqU0R5ajVqY1lYb24wWmFjbFVKaksxZk9Ud3JEQzI0VDBsdg==");
        ResponseEntity<CourseResponse> response = restTemplate.exchange(courseURL, HttpMethod.GET, requestParams,
                CourseResponse.class);
        return response.getBody();

    }
}
