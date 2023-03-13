package com.bridgelabz;
import java.util.Scanner;
public class Start {
        public static final int IsFullTime=1;
        public static final int IsPartTime = 2;

        public static class CompanyEmpWage {
                String CompanyName;
                int EmpWagePerHour;
                int WorkingDaysPerMonth;
                int TotalWorkingHours;

                CompanyEmpWage() {
                        Scanner in = new Scanner(System.in);
                        System.out.print("Enter the Company Name: ");
                        CompanyName = in.nextLine();
                        System.out.print("Enter the Employee Wage Per Hour: ");
                        EmpWagePerHour = in.nextInt();
                        System.out.print("Enter the Total Working Days for an Employee in a Month: ");
                        WorkingDaysPerMonth = in.nextInt();
                        System.out.print("Enter the Total Working Hours for an Employee in a Month: ");
                        TotalWorkingHours = in.nextInt();
                }

                public void EmpWageBuilder(){
                        int empHrs, empWagePerDay, empWagePerMonth=0, totalWorkingDays=0, totalEmpHours = 0, totalWage;

                        while(totalEmpHours <= TotalWorkingHours && totalWorkingDays < WorkingDaysPerMonth) {
                                totalWorkingDays++;
                                double empCheck = Math.floor(Math.random() * 10) % 2;
                                switch ((int) empCheck) {
                                        case IsFullTime:
                                                System.out.println("Employee is Doing Full Time!");
                                                empHrs = 8;
                                                break;
                                        case IsPartTime:
                                                System.out.println("Employee is Doing Part Time!");
                                                empHrs = 4;
                                                break;
                                        default:
                                                System.out.println("Employee is Absent!");
                                                empHrs = 0;
                                                break;
                                }
                                totalEmpHours+=empHrs;
                                empWagePerDay = empHrs * EmpWagePerHour;
                                empWagePerMonth += empWagePerDay;
                                System.out.println("Employee Wage per Day: " + empWagePerDay);
                        }
                        System.out.println("_________________________________________________________");
                        System.out.println("Employee Wage Per Month : "+empWagePerMonth);
                        totalWage= empWagePerMonth * 12;
                        System.out.println("Total Wage of the Employee Per Year: "+totalWage);
                        System.out.println();
                }
        }


        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                CompanyEmpWage[] Company= new CompanyEmpWage[5];

                System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
                System.out.println("----------------------------------------------------------------------");

                for(int i=0;i<Company.length;i++){
                        System.out.println("******************:MENU:******************");
                        System.out.println("PRESS 1: To Calculate the wage in a Company.");
                        System.out.println("PRESS 2: To EXIT.");
                        int choice= in.nextInt();
                        if (choice == 1) {
                                System.out.println("Enter the details:");
                                Company[i] = new CompanyEmpWage();
                                System.out.println("_________________________________________________");
                                Company[i].EmpWageBuilder();
                        }
                        else
                                i=Company.length;
                }

        }
}