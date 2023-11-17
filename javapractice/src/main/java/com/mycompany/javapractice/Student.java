package com.mycompany.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    String name;
    int gradeNo;
    int age;

    Student(String name, int gradeNo, int age) {
        this.name = name;
        this.gradeNo = gradeNo;
        this.age = age;
    }

    public void calculatePercentage() {
        double calculatePercentage = 0.0;
        System.out.print("Enter the number of subjects");
        Scanner input = new Scanner(System.in);
        int totalSubjects = input.nextInt();
        ArrayList<Integer> subjects = new ArrayList();

        for (int i = 0; i < totalSubjects; i++) {
            System.out.println("Enter marks of subject " + (i + 1));
            int mark = input.nextInt();
            subjects.add(mark);
        }

        for (int i = 0; i < totalSubjects; i++) {
            calculatePercentage += subjects.get(i);
        }
        double percentage = calculatePercentage / subjects.size();
        System.out.println("Percentage of the student is " + percentage);
    }

    public void showStudentDetails() {
        System.out.println("Name of the Student is " + this.name);
        System.out.println("In which class student is  " + this.gradeNo);
        System.out.println("Age of the Student is " + this.age);
    }

}
