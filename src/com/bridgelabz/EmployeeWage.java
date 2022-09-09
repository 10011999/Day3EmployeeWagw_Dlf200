package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if (check == fullTime) {
            System.out.println("Emp Present");
        } else {
            System.out.println("Emp Absent");
        }
    }
}
