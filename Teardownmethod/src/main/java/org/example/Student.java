package org.example;

public class Student {
    public String getGrade(int marks) {

        if (marks >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
