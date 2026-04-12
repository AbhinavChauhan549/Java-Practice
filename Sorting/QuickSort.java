import java.util.Scanner;

public class QuickSort {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the numbers : ");

    n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(" the numbers are : ");
    for (int a : arr) {
      System.out.println(a);

    }

    System.out.println("Quick Sort : ");

  }
}
