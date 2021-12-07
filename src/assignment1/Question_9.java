package assignment1;

import java.util.Scanner;
class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in meter:");
        float distance = sc.nextInt();
        System.out.println("Enter the hours taken:");
        int hrs = sc.nextInt();
        System.out.println("Enter the minutes:");
        int min = sc.nextInt();
        System.out.println("Enter the seconds:");
        int sec = sc.nextInt();
        Distance(distance, hrs, min, sec);
    }

    public static void Distance(float distance, int hrs, int min, int sec) {
        float result1 = (distance / (hrs * 60 * 60 + min * 60 + sec));
        System.out.println(result1);
        float result2 = ((distance / 1000) / (hrs + (min / 60) + (sec / (60 * 60))));
        System.out.println(result2);
        float result3 = ((distance / 1609) / (hrs + (min / 60) + (sec / (60 * 60))));
        System.out.println(result3);
    }
}