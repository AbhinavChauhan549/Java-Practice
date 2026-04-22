package Java8.StreamAPI;

import java.util.List;

public class FilterEven {

  public static void main(String[] args) {

    List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

    nums.stream()
        .filter(a -> a % 2 == 0)
        .forEach(System.out::println);
  }
}
