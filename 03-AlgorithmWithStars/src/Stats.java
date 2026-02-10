import java.util.Scanner;

public class Stats {
    public static void main() {


    }

    static void starsAlgorithmMix() {
//**&**
//**&**
//**&**
//**&**
//**&**
        System.out.println("Setirleri daxil edin:");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Sutunlari daxil edin:");
        int colm = new Scanner(System.in).nextInt();
        int middle = row / 2;
        for (int i = 0; i < colm; i++) {
            for (int j = 0; j < row; j++) {
                if (j == middle) {
                    System.out.print("8");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void basicStars() {
//******
//******
//******
//******
        System.out.println("Setirleri daxil edin:");
        int row = new Scanner(System.in).nextInt();
        System.out.println("Sutunlari daxil edin:");
        int colm = new Scanner(System.in).nextInt();

        for (int j = 0; j < colm; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void starsPhramid() {
//*
//**
//***
//****
//*****
        System.out.println("Olcunu daxil edin:");
        int colm = new Scanner(System.in).nextInt();

        for (int c = 1; c <= colm; c++) {
            for (int d = 1; d <= c; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void reverseStarsPramid() {
//*****
//****
//***
//**
//*
        System.out.println("Olcunu daxil edin: ");
        int size = new Scanner(System.in).nextInt();
        for (int y = size; y >= 1; y--) {
            for (int z = 1; z <= y; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void reversePhramid() {
// *******
//  *****
//   ***
//    *
        System.out.println("Hundurluyu daxil edin: ");
        int height = new Scanner(System.in).nextInt();

        for (int i = height; i >= 1; i--) {

            for (int s = 0; s < height - i; s++) {
                System.out.print(" ");
            }

            for (int u = 0; u < i * 2 - 1; u++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void reverseEmpty() {
//*      *
//**    **
//***  ***
//********

        System.out.println("Hundurluyu daxil edin: ");
        int height = new Scanner(System.in).nextInt();

        for (int i = 1; i <= height; i++) {

            for (int left = 1; left <= i; left++) {
                System.out.print("*");
            }

            for (int space = 1; space <= 2 * (height - i); space++) {
                System.out.print(" ");
            }

            for (int right = 1; right <= i; right++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void romb() {
//*      *
//*     ***
//*    *****
//*   *******
//*    *****
//*     ***
//*      *

        System.out.println("Hundurluyu daxil edin: ");
        int height = new Scanner(System.in).nextInt();

        System.out.println("Bosluqlarin sayini daxil edin: ");
        int gap = new Scanner(System.in).nextInt();

        int total = 2 * height - 1;
        for (int i = 0; i < total; i++) {
            System.out.print("*");

            for (int s = 0; s < gap; s++) {
                System.out.print(" ");
            }
            int row = (i < height) ? i : (total - 1 - i);
            int leftSpaces = (height - 1) - row;
            int stars = 2 * row + 1;

            for (int s = 0; s < leftSpaces; s++) {
                System.out.print(" ");
            }
            for (int u = 0; u < stars; u++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void sybolRomb() {
//*      *
//*     ***
//*    **$**
//*   **$$$**
//*    **$**
//*     ***
//*      *

        System.out.println("Hundurluyu daxil edin: ");
        int height = new Scanner(System.in).nextInt();

        System.out.println("Bosluqlarin sayini daxil edin: ");
        int gap = new Scanner(System.in).nextInt();

        int total = 2 * height - 1;
        int maxStars = 2 * height - 1;

        for (int i = 0; i < total; i++) {

            System.out.print("*");

            for (int s = 0; s < gap; s++) System.out.print(" ");

            int row = (i < height) ? i : (total - 1 - i);
            int leftSpaces = (height - 1) - row;
            int stars = 2 * row + 1;

            for (int s = 0; s < leftSpaces; s++) System.out.print(" ");

            if (stars == maxStars) {
                int side = (stars - 3) / 2;
                for (int k = 0; k < side; k++) System.out.print("*");
                System.out.print("$$$");
                for (int k = 0; k < side; k++) System.out.print("*");

            } else if (stars == maxStars - 2) {

                int side = (stars - 1) / 2;
                for (int k = 0; k < side; k++) System.out.print("*");
                System.out.print("$");
                for (int k = 0; k < side; k++) System.out.print("*");

            } else {

                for (int k = 0; k < stars; k++) System.out.print("*");
            }

            System.out.println();
        }
    }
}
