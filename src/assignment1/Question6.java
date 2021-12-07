package assignment1;

import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        IncreaseDecrease(num1, num2, num3);
    }

    public static void IncreaseDecrease(int num1, int num2, int num3) {
        if (num1 > num2 && num2 > num3)
            System.out.println("Decreasing Order");
        else if (num1 < num2 && num2 < num3)
            System.out.println("Increasing Order");
        else
            System.out.println("Neither Increasing nor Decreasing order");
    }
}