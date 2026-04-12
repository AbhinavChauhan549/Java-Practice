import java.util.*;

public class MergeSort {

  static void merge(int[] arr, int left, int mid, int right) {

    // creating a temp array to perform sorting and again placing values in array
    int[] temp = new int[right - left + 1];

    int i = left, j = mid + 1, k = 0;
    while (i <= mid && j <= right) {
      if (arr[i] > arr[j]) {
        temp[k++] = arr[j++];

      } else {
        temp[k++] = arr[i++];
      }
    }

    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    while (j <= right) {
      temp[k++] = arr[j++];
    }

    for (i = left, k = 0; i <= right; i++, k++) {
      arr[i] = temp[k];
    }
  }

  static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {

      int mid = left + (right - left) / 2;

      mergeSort(arr, left, mid);

      mergeSort(arr, mid + 1, right);

      merge(arr, left, mid, right);
    }
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

    System.out.println("Merge Sort : ");
    mergeSort(arr, 0, n - 1);

    for (int a : arr) {
      System.out.println(a);

    }

  }

}
