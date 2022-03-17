package com.Harman;

import java.util.Scanner;

public class Prgm2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        double Square_root=Math.sqrt(number);
        System.out.println("Square of a given number is:"+Square_root);

    }
}
