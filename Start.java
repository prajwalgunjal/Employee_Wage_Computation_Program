package com.bridgelabz;
import java.util.Scanner;
public class Start {
        public static final int IsFullTime=1;
        public static final int IsPartTime = 2;
        public static int EmpWagePerHour, WorkingDaysPerMonth, TotalWorkingHours;

        public void EmpWageBuilder1() {
                EmpWagePerHour=300;
                WorkingDaysPerMonth=20;
                TotalWorkingHours=100;
                System.out.println("Total Company Wage: "+(EmpWagePerHour*TotalWorkingHours));
        }

        public void EmpWageBuilder2() {
                EmpWagePerHour=500;
                WorkingDaysPerMonth=23;
                TotalWorkingHours=120;
                System.out.println("Total Company Wage: "+(EmpWagePerHour*TotalWorkingHours));
        }

        public void EmpWageBuilder3() {
                EmpWagePerHour=200;
                WorkingDaysPerMonth=25;
                TotalWorkingHours=150;
                System.out.println("Total Company Wage: "+(EmpWagePerHour*TotalWorkingHours));
        }

        public void ComputeWage(){
                int empHrs, empWagePerDay, empWagePerMonth=0, totalWorkingDays=0, totalEmpHours = 0, totalWage;
                while(totalEmpHours <= TotalWorkingHours && totalWorkingDays < WorkingDaysPerMonth) {
                        totalWorkingDays++;
                        double empCheck = Math.floor(Math.random() * 10) % 2;
                        switch ((int) empCheck) {
                                case IsFullTime:
                                        System.out.println("Employee is Doing Full Time:");
                                        empHrs = 8;
                                        break;
                                case IsPartTime:
                                        System.out.println("Employee is Doing Part Time:");
                                        empHrs = 4;
                                        break;
                                default:
                                        System.out.println("Employee is Absent:");
                                        empHrs = 0;
                                        break;
                        }
                        totalEmpHours+=empHrs;
                        empWagePerDay = empHrs * EmpWagePerHour;
                        empWagePerMonth += empWagePerDay;
                        System.out.println("Employee Wage per Day: " + empWagePerDay);
                }
                System.out.println("Employee Wage Per Month : "+empWagePerMonth);
                totalWage= empWagePerMonth * 12;
                System.out.println("Total Wage of the Employee Per Year: "+totalWage);
        }
        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
                System.out.println("----------------------------------------------------------------------");
                System.out.println("Enter the Company Name: \n1.TCS\n2.Cognizant\n3.Infosys");
                int company= in.nextInt();
                Start s= new Start();
                switch (company){
                        case 1:
                                s.EmpWageBuilder1();
                                s.ComputeWage();
                                break;
                        case 2:
                                s.EmpWageBuilder2();
                                s.ComputeWage();
                                break;
                        case 3:
                                s.EmpWageBuilder3();
                                s.ComputeWage();
                                break;
                        default:
                                System.out.println("Enter a valid company!!!");
                                break;
                }

        }
}