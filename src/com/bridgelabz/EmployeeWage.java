package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        int perHourWage = 20;
        int partTime = 2;
        double check = Math.floor(Math.random() * 10) % 3;
        if (check == fullTime) {
            System.out.println("Emp Present");
            int Hrs = 8;
            int salary = perHourWage * Hrs;
            System.out.println("Salary Amount: " +salary);
        } if (check == partTime){
            System.out.println("Emp present in Part Time");
            int Hrs = 8;
            int salary = partTime * Hrs;
            System.out.println("Part Time Salary " +salary);
        }
        else {
            System.out.println("Emp Absent");
            int Hrs = 0;
            int salary = perHourWage * Hrs;
            System.out.println("Salary Amount: " +salary);
        }
    }
}
