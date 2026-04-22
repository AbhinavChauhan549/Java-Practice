package Java8.LambdaFunction;

import java.util.Arrays;
import java.util.List;

public class SortStringByLength {

  public static void main(String[] args) {

    // Sort a list of strings based on their length using a lambda expression.
    List<String> names = Arrays.asList("Java", "Python", "C", "JavaScript");

    names.sort((a, b) -> a.length() - b.length());
    System.out.println(names);

  }
}
