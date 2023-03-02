package com.bridgelabz;
public class Start {
    public static void main(String[] args){
        System.out.println(" Check whether Employee is present or absent");
        int empPresesent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == empPresesent){
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}