package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        // to add a course
        System.out.println("Hello, Please add a course!");
        System.out.println("What's the name of the course you wanna add ?");
        String courseName = userInput.next();
        System.out.println("How much it costs?");
        int courseFees = userInput.nextInt();
        Course course = new Course(1, courseName, courseFees);

        // to add an instructor
        System.out.println("Hello instructor, What's your name?");
        String instructorFullName = userInput.next();
        System.out.println("And your email ?");
        String instructorEmail = userInput.next();
        System.out.println("your password please ?");
        String instructorPassword = userInput.next();
        Instructor instructor = new Instructor(1, instructorFullName, instructorEmail, instructorPassword);


        // to add an assistant
        System.out.println("Hello assistant, What's your name?");
        String assistantFullName = userInput.next();
        System.out.println("And your email ?");
        String assistantEmail = userInput.next();
        System.out.println("your password please ?");
        String assistantPassword = userInput.next();
        Assistant assistant = new Assistant(1, assistantFullName, assistantEmail, assistantPassword);


        // to add student
        System.out.println("Hello student, What's your name?");
        String studentFullName = userInput.next();
        System.out.println("And your email ?");
        String studentEmail = userInput.next();
        System.out.println("your password please ?");
        String studentPassword = userInput.next();
        Student student = new Student(1, studentFullName, studentEmail, studentPassword);


        // add course to instructor list of courses
        instructor.addCourse(course);

        // register an instructor for course
        course.setInstructor(instructor);

        // register a course for student
        student.registerCourse(course, new Payment("02031031203", true));
        

    }
}
