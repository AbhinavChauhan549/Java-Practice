package Java8.StreamAPI;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlattenListofLists {
  public static void main(String[] args) {

    List<List<Integer>> list = List.of(
        List.of(1, 2),
        List.of(3, 4),
        List.of(5, 6));

    List<Integer> result = list.stream()
        .flatMap(innerList -> innerList.stream())
        .collect(Collectors.toList());

    System.out.println(result);
  }
}
