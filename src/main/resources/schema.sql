CREATE SCHEMA COURSES;
CREATE TABLE COURSES.COURSE_DETAILS (course_id number primary key, title varchar(100), course_url varchar(100), catrgory varchar(50));
CREATE TABLE COURSES.INSTRUCTOR (instructor_id number primary key, display_name varchar(100), instructor_url varchar(100), job_title varchar(100));
CREATE TABLE COURSES.AUDIT_TABLE (audit_id number(10) primary key, audit_detail varchar(4000), log_level varchar(100), update_tmstmp date);