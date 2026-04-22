package Java8.StreamAPI;

import java.util.List;

/*

Given a list of names:

Keep only names that start with "A"
Convert them to uppercase

*/
public class FilterStrings {

  public static void main(String[] args) {
    List<String> names = List.of("Aman", "Ravi", "Ankit", "John");

    names.stream()
        // .filter(s -> s.charAt(0) == 'A')
        .filter(s -> s.startsWith("A"))
        .map(String::toUpperCase)
        .forEach(System.out::println);
  }
}
