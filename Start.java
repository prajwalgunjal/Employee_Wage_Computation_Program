package com.bridgelabz;
public class Start {

private static final int IS_FULL_TIME = 1;
private static final int IS_PART_TIME = 2;

private final String company;
private final int empRate;
private final int numOFDays;
private final int maxHours;
private int empWagePerMonth;

public Start(String company, int empRate, int numOFDays, int maxHours) {
        this.company = company;
        this.empRate = empRate;
        this.numOFDays = numOFDays;
        this.maxHours = maxHours;
        }

public void calculateEmpWageForCompany() {

        int empHrs = 0, totalWorkingdays = 0, totalEmpHours = 0;

        while (totalEmpHours <= maxHours && totalWorkingdays < numOFDays) {

        totalWorkingdays++;
        int empType = (int) Math.floor(Math.random() * 10) % 3;

        switch (empType) {
        case IS_FULL_TIME:
        System.out.println("Employee Doing Full Time:");
        empHrs = 8;
        break;
        case IS_PART_TIME:
        System.out.println("Employee Doing Part Time:");
        empHrs = 4;
        break;
        default:
        System.out.println("Employee Is Absent:");
        empHrs = 0;
        }

        totalEmpHours += empHrs;
        int empWagePerDay = empHrs * empRate;
        empWagePerMonth += empWagePerDay;
        System.out.println("Emp Wage Per Day : " + empWagePerDay);
        }

        }
@Override
public String toString() {
        return "Emp Wage Per Month for Company " + company + " is : " + empWagePerMonth;
        }

public static void main(String[] args) {

        Start obj1 = new Start("Dmart", 20, 2, 10);
        Start obj2 = new Start("bigbazzar", 40, 5, 20);

        obj1.calculateEmpWageForCompany();
        System.out.println(obj1);
        System.out.println();
        obj2.calculateEmpWageForCompany();
        System.out.println(obj2);
    }

}