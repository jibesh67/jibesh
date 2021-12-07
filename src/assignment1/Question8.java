package assignment1;

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your weight in kg:");
        float kg = sc.nextInt();
        System.out.println("Enter your height in meter square:");
        float m2=sc.nextInt();
        Bmi(kg,m2);
    }
    public static void Bmi(float kg,float m2){
        float bmi = (kg/m2);
        System.out.println(bmi);
    }
}