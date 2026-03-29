package com.company.main;

import com.company.hr.*;          
import com.company.payroll.Payroll; 

public class MainApp {
    public static void main(String[] args) {

        
        Employee emp = new Employee(101, "Ankit", "HR", 40000);

        System.out.println("=== Before Bonus ===");
        emp.displayEmployee();

        
        Payroll p = new Payroll();
        double bonus = p.calculateBonus(emp);

        System.out.println("\nBonus Added: " + bonus);

        System.out.println("\n=== After Bonus ===");
        emp.displayEmployee();
    }
}