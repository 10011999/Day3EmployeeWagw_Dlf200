package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome Employees");
        int fullTime = 1;
        int empWorkingDays = 2;
        int perHourWage = 20;
        int partTime = 2;
        int totalEmpHrs = 0;
        int empHrs = 0;
        int maxHrsMonth = 100;
        int totalWorkingDay = 0;

        while (totalEmpHrs <= maxHrsMonth && totalWorkingDay < empWorkingDays){
            totalWorkingDay++;
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
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("Day : " +totalWorkingDay+"Hrs: " +empHrs );
        }
        int totalEmpWage = totalEmpHrs * perHourWage;
        System.out.println("month salary = " +totalEmpWage );
    }
}