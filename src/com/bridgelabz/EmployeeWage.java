package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        int empWorkingDays = 2;
        int perHourWage = 20;
        int partTime = 2;
        int monthSalary = 0;
        int empWage = 0;
        for (int i = 1; i < empWorkingDays; i++) {
            int check = (int) Math.floor(Math.random() * 10) % 3;
            switch (check) {
                case 1:
                    System.out.println("Emp Present");
                    int Hrs = 8;
                    int salary = perHourWage * Hrs;
                    System.out.println("Salary Amount: " + salary);
                    break;
                case 2:
                    System.out.println("Emp present in Part Time");
                    Hrs = 4;
                    salary = partTime * Hrs;
                    System.out.println("Part Time Salary " + salary);
                    break;
                default:
                    System.out.println("Emp Absent");
                    Hrs = 0;
                    salary = perHourWage * Hrs;
                    System.out.println("Salary Amount: " + salary);
                    break;
            }
            monthSalary = empWage + monthSalary;
        }
        System.out.println("month salary = " +monthSalary );
    }
}