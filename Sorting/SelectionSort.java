import java.util.*;

public class SelectionSort {

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

    System.out.println("Selection Sort : ");
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    for (int a : arr) {
      System.out.println(a);

    }

  }
}
