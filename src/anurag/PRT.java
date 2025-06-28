//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package anurag;

import java.util.Scanner;

public class PRT {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Enter principal ");
        double principal = ip.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = ip.nextDouble();

        System.out.print("Enter Time: ");
        double time = ip.nextDouble();

        double simpleintrest = (principal*rate*time)/100;

        System.out.println("Simple Intrest is : " + simpleintrest);
    }
}
