package StarPatterns;

import java.util.*;

public class Patterns {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n;
    System.out.println("Enter the value of n : ");
    n = sc.nextInt();

    // 1. Pattern 1 =>

    /*
     * 
     * * * *
     * * * *
     * * * *
     * * * *
     * 
     */

    // System.out.println("Pattern 1 : ");
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Patter 2 =>

    /*
     *
     * 
     * *
     * * *
     * * * *
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 3 =>
    /*
     * 
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(j + 1 + " ");
    // }
    // System.out.println();
    // }

    /*
     * 
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(i + 1 + " ");
    // }
    // System.out.println();
    // }

    // Pattern 5 =>

    /*
     * 
     * * * * *
     * * * *
     * * *
     * *
     * 
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 6 =>

    /*
     * 
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print(j + 1 + " ");
    // }
    // System.out.println();
    // }

    // Pattern 7 =>

    /*
     *
     * 
     * * *
     * * * * *
     * * * * * * *
     * 
     */

    // for (int i = 0; i < n; i++) {

    // // for printing the spaces that are before the *
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print(" ");
    // }

    // // for printing the first half of the star(left part )
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }

    // // for printing the second half of the stars (right part)
    // for (int j = 0; j < i; j++) {
    // System.out.print("* ");
    // }

    // System.out.println();
    // }

    // Pattern 8 =>

    /*
     * 
     * * * * * * *
     * * * * *
     * * *
     *
     * 
     */

    // for (int i = 0; i < n; i++) {

    // // for printing the white spaces on the left side
    // for (int j = 0; j < i; j++) {
    // System.out.print(" ");
    // }

    // // for printing the left side stars
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("* ");
    // }

    // // for printing the right side stars
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 9 =>
    /*
     *
     * 
     * * *
     * * * * *
     * * * * *
     * * *
     *
     * 
     */

    // combination of pattern 7 and 8
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 10 =>
    /*
     * 
     * 
     * *
     * * *
     * * * *
     * * *
     * *
     * 
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 11 =>
    /*
     * 
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     * 
     */
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // if ((i + j) % 2 == 0) {
    // System.out.print("1 ");
    // } else {
    // System.out.print("0 ");
    // }
    // }
    // System.out.println();
    // }

    // Pattern 12 =>
    /*
     * 
     * 1 1
     * 1 2 2 1
     * 1 2 3 3 2 1
     * 1 2 3 4 4 3 2 1
     * 
     */

    // for (int i = 0; i < n; i++) {
    // // for left side no's
    // for (int j = 0; j <= i; j++) {
    // System.out.print(j + 1 + " ");
    // }

    // // for white spaces in between
    // for (int j = 0; j < 2 * (n - i - 1); j++) {
    // System.out.print(" ");
    // }

    // // for right side no's
    // for (int j = i; j >= 0; j--) {
    // System.out.print(j + 1 + " ");
    // }
    // System.out.println();
    // }

    // Pattern 13 =>
    /*
     * 
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 
     */

    // int count = 1;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(count++ + " ");
    // }
    // System.out.println();
    // }

    // Pattern 14 =>
    /*
     * 
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (char ch = 'A'; ch <= 'A' + i; ch++) {
    // System.out.print(ch + " ");
    // }
    // System.out.println();
    // }

    // Pattern 15 =>
    /*
     * 
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (char ch = 'A'; ch < 'A' + n - i; ch++) {
    // System.out.print(ch + " ");
    // }
    // System.out.println();
    // }

    // Pattern 16 =>
    /*
     * 
     * A
     * B B
     * C C C
     * D D D D
     * E E E E E
     * 
     */

    // for (int i = 0; i < n; i++) {
    // char ch = (char) ('A' + i);
    // for (int j = 0; j <= i; j++) {

    // System.out.print(ch + " ");
    // }
    // System.out.println();
    // }

    // Pattern 17 =>
    /*
     * 
     * A
     * A B A
     * A B C B A
     * A B C D C B A
     * 
     */

    // for (int i = 0; i < n; i++) {
    // // for printing the white spaces
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print(" ");
    // }

    // // for printing left side alphabets
    // for (char ch = 'A'; ch <= 'A' + i; ch++) {
    // System.out.print(ch + " ");
    // }

    // // for printing the right side alphabets
    // char ch = (char) ('A' + i - 1);
    // for (int j = 0; j < i; j++) {
    // System.out.print(ch + " ");
    // ch--;
    // }
    // System.out.println();
    // }

    // Pattern 18 =>
    /*
     * 
     * E
     * D E
     * C D E
     * B C D E
     * A B C D E
     * 
     */

    // for (int i = 0; i < n; i++) {
    // char ch = (char) ('A' + n - i - 1);
    // for (int j = 0; j <= i; j++) {

    // System.out.print(ch + " ");
    // ch++;
    // }
    // System.out.println();
    // }

    // Pattern 19 =>
    /*
     * 
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     * *
     * * * *
     * * * * * *
     * * * * * * * *
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < 2 * (i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j < n - i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < 2 * (n - i - 1); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 20 =>

    /*
     * *
     * * * *
     * * * * * *
     * * * * * * * *
     * * * * * *
     * * * *
     * *
     */

    // butterfly pattern

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < 2 * (n - i - 1); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // for (int i = 0; i < n - 1; i++) {
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print("* ");
    // }
    // for (int j = 0; j < 2 * (i + 1); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 0; j < n - i - 1; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }

    // Pattern 21 :
    /*
     * 
     * Square Pattern
     * 
     * * * *
     * *
     * *
     * * * *
     * 
     */

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
    // System.out.print("* ");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // Pattern 22 =>
    /*
     * 
     * 4 4 4 4 4 4 4
     * 4 3 3 3 3 3 4
     * 4 3 2 2 2 3 4
     * 4 3 2 1 2 3 4
     * 4 3 2 2 2 3 4
     * 4 3 3 3 3 3 4
     * 4 4 4 4 4 4 4
     * 
     */

    for (int i = 0; i < (2 * n) - 1; i++) {
      for (int j = 0; j < (2 * n) - 1; j++) {

        int top = i;
        int left = j;
        int right = (2 * n - 1) - 1 - j;
        int bottom = (2 * n - 1) - 1 - i;

        int min = Math.min(Math.min(top, bottom), Math.min(left, right));

        System.out.print((n - min) + " ");
      }
      System.out.println();
    }

  }

}
