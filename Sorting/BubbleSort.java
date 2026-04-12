import java.util.*;

class BubbleSort {

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

    System.out.println("Bubble Sort : ");

    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    System.out.println(" the numbers after sorting : ");
    for (int a : arr) {
      System.out.println(a);

    }
  }
}