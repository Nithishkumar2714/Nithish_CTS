package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
        System.out.println("Setup: Student object created");
    }

    @Test
    public void testGetGrade() {

        int marks = 75;

        String result = student.getGrade(marks);

        assertEquals("Pass", result);
    }
    
    @AfterEach
    public void tearDown() {
        student = null;
        System.out.println("Teardown: Student object destroyed");
    }

}
