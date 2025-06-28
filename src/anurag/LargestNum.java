//Take 2 numbers as input and print the largest number.
package anurag;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = ip.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = ip.nextDouble();

        if(num1 > num2 ){
            System.out.println("Largest number is: " + num1);
        }
        else{
            System.out.println("Largest number is: " + num2);
        }
    }
}
