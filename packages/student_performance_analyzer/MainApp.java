package com.school.main;

import com.school.data.*;   
import com.school.util.*;   

public class MainApp {
    public static void main(String[] args) {

        
        Student s = new Student("Priya", 85, 78, 92);

        
        Analyzer analyzer = new Analyzer();

        
        double avg = analyzer.calculateAverage(s);
        String grade = analyzer.findGrade(avg);

        
        System.out.println("=== Student Details ===");
        System.out.println(s);  

        System.out.println("\nAverage Marks: " + avg);
        System.out.println("Grade: " + grade);
    }
}