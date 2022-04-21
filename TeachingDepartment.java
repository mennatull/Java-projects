package com.company;

import java.util.ArrayList;

public interface TeachingDepartment {

    void teach(ArrayList<Course> courses);

    // overloading
    void teach();

}
