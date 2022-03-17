package com.Harman;

import java.util.Scanner;

public class Prgm3 {
    public static void main(String[] args) {
        int number1,number2,sum,difference,product,average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers greater than 10000");
        System.out.println("Enter number 1:");
        number1=sc.nextInt();
        System.out.println("Enter number 2:");
        number2=sc.nextInt();
        if((number1>10000) && (number2>10000)){
            sum=number1+number2;
            System.out.println("Sum of 2 numbers:"+sum);
            difference=number1-number2;
            System.out.println("Difference of 2 numbers:"+difference);
            product=number1*number2;
            System.out.println("Product of 2 numbers:"+product);
            average=number1/number2;
            System.out.println("Average of 2 numbers:"+average);
        }
        else{
            System.out.println("The given number is less than 10000");
        }
    }
}
