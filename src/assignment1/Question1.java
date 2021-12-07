package assignment1;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number upto which prime number you need: ");
        number = sc.nextInt();
        System.out.println("Prime numbers are: ");
        resultPrint(number);
    }

    public static void resultPrint(int number) {
        for (int i = 2; i <= number; i++) {
            int counter = 0;
            for (int b = 1; b <= i; b++) {
                if (i % b == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
    }
}