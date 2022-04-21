package com.company;

import java.util.ArrayList;

public class Student extends User {

    private ArrayList<Course> coursesList = new ArrayList<>();
    private Payment payment;


    public Student(int userId, String fullName, String email, String password) {
        super(userId, fullName, email, password);
    }


    public void registerCourse(Course course, Payment payment) {
        if (payment.isSuccessfullyPurchased()) {
            coursesList.add(course);
            System.out.println("Congrats, you have purchased this course successfully!");
        } else {
            System.out.println("Error happened, please try again!");
        }
    }

    public void removeCourse(Course course) {
        coursesList.remove(course);
    }

    public ArrayList<Course> getCoursesList() {
        return coursesList;
    }

    public void setCoursesList(ArrayList<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
