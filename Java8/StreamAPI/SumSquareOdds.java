package Java8.StreamAPI;

import java.util.List;

public class SumSquareOdds {
  public static void main(String[] args) {

    List<Integer> nums = List.of(1, 2, 3, 4, 5);

    int summed = nums.stream()
        .filter(a -> a % 2 != 0)
        .mapToInt(a -> a * a)
        .sum();

    System.out.println(summed);
  }
}
