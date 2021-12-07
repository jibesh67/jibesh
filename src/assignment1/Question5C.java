package assignment1;

public class Question5C {
    public static void main(String[] args) {

        Star();
    }

    public static void Star() {
        int row = 6;
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

    }
}