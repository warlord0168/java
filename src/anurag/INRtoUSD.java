//Input currency in rupees and output in USD
package anurag;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Enter currency in Rupees: ");
        float rupees = ip.nextFloat();

        double usd = (rupees/ 85.5094 );
        System.out.println("Rupee in USD = " + usd);
    }
}
