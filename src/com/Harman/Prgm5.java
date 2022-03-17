package com.Harman;

import java.util.Scanner;

public class Prgm5 {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.println("The given year is leap year");
        }
        else{
            System.out.println("The given year is not a leap year");
        }
    }
}
