import java.util.Scanner;

public class QuickSort {

  static void quickSort(int[] arr, int low, int high) {

    if (low >= high) {
      return;
    }
    int s = low;
    int e = high;

    int mid = s + (e - s) / 2;

    int pivot = arr[mid];

    while (s <= e) {
      while (arr[s] < arr[mid]) {
        s++;
      }
      while (arr[e] > arr[mid]) {
        e--;
      }
      // if condition to make sure that s<=e is not disturbed
      if (s <= e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
      }
    }

    // now my pivot is at correct index , now repeat this step for array that is at
    // left and right side of pivot
    quickSort(arr, s, high);
    quickSort(arr, low, e);

  }

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
    quickSort(arr, 0, arr.length - 1);

    for (int a : arr) {
      System.out.println(a);

    }

  }
}
