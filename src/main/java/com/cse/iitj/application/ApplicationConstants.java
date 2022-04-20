package com.cse.iitj.application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationConstants {

    private static String BUSINESS = "Business";

    private static String DESIGN = "Design";

    private static String DEVELOPMENT = "Development";

    private static String FINANCE = "Finance & Accounting";

    private static String HEALTH = "Health & Fitness";

    private static String IT_SOFTWARE = "IT & Software ";

    private static String LIFESTYLE = "Lifestyle";

    private static String MARKETING = "Marketing";

    private static String MUSIC = "Music";

    private static String OFFICE_PROD = "Office Productivity";

    private static String PERSONAL_DEV = "Personal Development";

    private static String PHOTOGRAPHY = "Photography & Video";

    private static String TEACHING = "Teaching & Academics";

    public static Integer MAX_PAGE_NUMBER = 3;

    public static String MAX_PAGE_SIZE = "100";

    public static String JVM_VAR = "JVM";

    public static String THIRD_PARTY = "TP";

    public static String DATABASE = "DB";

    public static String APP_URL = "/healthCheck";

    public static String SYNC_JOB = "syncJob";

    public static String LOG_DEBUG = "DEBUG";

    public static String LOG_INFO = "INFO";

    public static String LOG_WARN = "WARN";

    public static String LOG_ERROR = "ERROR";

    public static String LOG_FATAL = "FATAL";

    public static String LOG_OFF = "OFF";

    public static List<String> CATEGORY_SET = new ArrayList<>();

    static {
        CATEGORY_SET.add(BUSINESS);
        CATEGORY_SET.add(DESIGN);
        CATEGORY_SET.add(DEVELOPMENT);
        CATEGORY_SET.add(FINANCE);
        CATEGORY_SET.add(HEALTH);
        CATEGORY_SET.add(IT_SOFTWARE);
        CATEGORY_SET.add(LIFESTYLE);
        CATEGORY_SET.add(LIFESTYLE);
        CATEGORY_SET.add(MARKETING);
        CATEGORY_SET.add(MUSIC);
        CATEGORY_SET.add(OFFICE_PROD);
        CATEGORY_SET.add(PERSONAL_DEV);
        CATEGORY_SET.add(PHOTOGRAPHY);
        CATEGORY_SET.add(TEACHING);
    }
}
