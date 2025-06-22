package com.example.mvc;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student model      = new Student("Avi Anand", "S123", "B");
        StudentView view   = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        System.out.println("---");

        controller.setStudentName("Anand Avi");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
