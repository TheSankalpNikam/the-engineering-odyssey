package CoreJava.Patterns;

import java.util.Scanner;

public class Patterns {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Patterns pt = new Patterns();

        // Calling Pattern 1
        // pt.pattern1();

        // Calling Pattern 2
        // pt.pattern2();

        // Calling Pattern 3
        // pt.pattern3();

        // Calling Pattern 4
        // pt.pattern4();

        // Calling Pattern 5
        // pt.pattern5();

        // Calling Pattern 6
        // pt.pattern6();

        // Calling Pattern 7
        // pt.pattern7();

        // Calling Pattern 8
        pt.pattern8();
    }

    public void pattern1() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern4() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern5() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pattern7() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            if (i >= 2) {
                for (int l = 2; l <= i; l++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void pattern8() {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= num - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
