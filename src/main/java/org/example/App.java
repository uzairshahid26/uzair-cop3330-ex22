/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;

public class App {

    public static boolean contain(int[] num, int x) {

        for (int n : num)
            if (n == x)
                return true;
        return false;

    }

    public static void main( String[] args )

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter TEN NUMBERS. ");

        int[] num = new int[100];
        int count = 1;
        int largest = 0;

        while(count < 11) {


            System.out.print("Enter number " +count+ ": ");
            int x = scanner.nextInt();
            if (x == -1)
                break;

            if (contain(num, x)) {
                System.out.println("Number already exists. Please Enter a different number!");
                continue;
            }

            num[count++] = x;

            largest = Math.max(x, largest);

        }

        System.out.println("The largest number is " + largest);

        scanner.close();

    }

}