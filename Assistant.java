package com.company;

import java.util.ArrayList;

public class Assistant extends User implements TeachingDepartment {

    private ArrayList<Course> assistantCoursesList = new ArrayList<>();


    public Assistant(int userId, String fullName, String email, String password) {
        super(userId, fullName, email, password);
    }

    @Override
    public void teach(ArrayList<Course> assistantCoursesList) {
        this.assistantCoursesList = assistantCoursesList;
    }

    @Override
    public void teach() {
        System.out.println("we have an online weekly meeting to follow up with the progress of students.");
    }

    public ArrayList<Course> getAssistantCoursesList() {
        return assistantCoursesList;
    }

    public void setAssistantCoursesList(ArrayList<Course> assistantCoursesList) {
        this.assistantCoursesList = assistantCoursesList;
    }
}
