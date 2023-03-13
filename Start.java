package com.bridgelabz;
import java.util.Scanner;
import java.util.ArrayList;

interface company {
        void EmpWageBuilder();
}
public class Start {


        public static final int IsFullTime=1;
        public static final int IsPartTime = 2;

        static class CompanyEmpWage implements company{
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
                                                System.out.print("Employee is Doing Full Time!");
                                                empHrs = 8;
                                                break;
                                        case IsPartTime:
                                                System.out.print("Employee is Doing Part Time!");
                                                empHrs = 4;
                                                break;
                                        default:
                                                System.out.print("Employee is Absent!");
                                                empHrs = 0;
                                                break;
                                }
                                totalEmpHours+=empHrs;
                                empWagePerDay = empHrs * EmpWagePerHour;
                                empWagePerMonth += empWagePerDay;
                                System.out.println(" "+empWagePerDay+" is added to Employee Wage");
                        }
                        System.out.println("_________________________________________________________");
                        System.out.println("Employee Wage Per Day for FullTime: "+(8*EmpWagePerHour));
                        System.out.println("Employee Wage Per Day for PartTime: "+(4*EmpWagePerHour));
                        System.out.println("Employee Wage Per Month : "+empWagePerMonth);
                        totalWage= empWagePerMonth * 12;
                        System.out.println("Total Wage of the Employee Per Year: "+totalWage);
                        System.out.println();
                }
        }


        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);

                ArrayList<CompanyEmpWage> CompanyList= new ArrayList<>();

                System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
                System.out.println("----------------------------------------------------------------------");

                for(int i=0;i<10;i++){
                        System.out.println("******************:MENU:******************");
                        System.out.println("PRESS 1: To Calculate the wage in a Company.");
                        System.out.println("PRESS 2: To EXIT.");
                        int choice= in.nextInt();
                        if (choice == 1) {
                                System.out.println("Enter the details:");
                                CompanyEmpWage Company= new CompanyEmpWage();
                                CompanyList.add(Company);
                                System.out.println("_________________________________________________");
                                Company.EmpWageBuilder();
                        }
                        else
                                i=10;
                }
                System.out.println(CompanyList);

        }
}