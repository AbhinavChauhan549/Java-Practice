package Java8.StreamAPI;

import java.util.List;

public class CountWordLength {
  public static void main(String[] args) {

    List<String> words = List.of("cat", "lion", "tiger", "dog", "elephant");

    long count = words.stream()
        .filter(s -> s.length() > 3)
        .count();

    System.out.println(count);
  }
}
