package com.company;

import java.util.ArrayList;

public class SystemInfo {

    private ArrayList<Course> coursesList = new ArrayList<>();
    private ArrayList<Student> studentsList = new ArrayList<>();
    private ArrayList<Instructor> instructorsList = new ArrayList<>();
    // Singleton design pattern
    private static SystemInfo systemInfo;

    private SystemInfo() {

    }

    public static SystemInfo getInstance() {
        if (systemInfo == null) {
            systemInfo = new SystemInfo();
        }
        return systemInfo;
    }

    public void addCourse(Course course) {
        coursesList.add(course);
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void addInstructor(Instructor instructor) {
        instructorsList.add(instructor);
    }


    public ArrayList<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public ArrayList<Instructor> getInstructorsList() {
        return instructorsList;
    }

    public void setInstructorsList(ArrayList<Instructor> instructorsList) {
        this.instructorsList = instructorsList;
    }
}
