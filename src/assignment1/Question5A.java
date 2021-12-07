package assignment1;

public class Question5A {
    public static void main(String[] args) {
        Star();
    }

    public static void Star() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}