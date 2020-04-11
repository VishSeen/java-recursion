package com.vish.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number : ");

        int num = scanner.nextInt();

        System.out.print("Factorial of " + num + " : ");

        System.out.println(factorial(num));
    }


    /**
     * Recursion is calling a method inside itself.
     *
     * @param n : a number to check factorial of
     * @return : factorial of the number till number = 1
     */
    public static int factorial(int n){
        if(n != 0){
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
