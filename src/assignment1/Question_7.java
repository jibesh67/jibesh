package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the decimal number:");
        float num2 = sc.nextFloat();
        DecimalCheck(num1, num2);
    }

    public static void DecimalCheck(float num1, float num2) {
        String pattern = "00.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String dFormat = decimalFormat.format(num1);
        System.out.println(dFormat);
        String dFormat1 = decimalFormat.format(num2);
        System.out.println(dFormat1);
        if (dFormat.equals(dFormat1))
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}