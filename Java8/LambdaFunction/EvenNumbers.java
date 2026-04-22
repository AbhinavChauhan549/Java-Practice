package Java8.LambdaFunction;

import java.util.Scanner;

public class EvenNumbers {

  public interface Even {

    boolean checkEven(int r);

  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the numbers : ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Even numbers are : ");
    Even checkEven = (num) -> num % 2 == 0;

    for (int i = 0; i < n; i++) {
      if (checkEven.checkEven(arr[i])) {
        System.out.println(arr[i]);
      }
    }

  }
}
