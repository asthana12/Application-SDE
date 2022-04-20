package com.cse.iitj.application;

public class GeneratorUtil {

    public static Integer courseIdGenerator() {
        int min = 0;
        int max = Integer.MAX_VALUE;

        Double generator = Math.random() * (max - min + 1) + min;
        Integer courseId = generator.intValue();
        return courseId;
    }

    public static Integer instructorIdGenerator() {
        int min = 0;
        int max = Integer.MAX_VALUE;

        Double generator = Math.random() * (max - min + 1) + min;
        Integer courseId = generator.intValue();
        return courseId;
    }
}
