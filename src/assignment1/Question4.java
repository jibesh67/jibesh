package assignment1;

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = sc.nextInt();
        int sum = 0;
        int result = Reverse(num);
        Sum(result,sum,num);
    }



    public static int Reverse(int num){
        int reverse =0;
        while (num>0){
            int rem = num%10;
            reverse = reverse*10+rem;
            num /=10;
        }
        return reverse;
    }
    public static void Sum(int result,int sum,int num){

        while(result>0){
            int digit =result%10;
            sum = sum+ digit;
            result /=10;
            System.out.println(digit);
        }
        System.out.println("The sum of Digits of "+num+" is :"+sum);
    }
}