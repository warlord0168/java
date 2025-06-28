package anurag;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = ip.nextInt();

        if( num / 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}