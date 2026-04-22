package Java8.LambdaFunction;

import java.util.Arrays;
import java.util.List;

public class SquareEachNumber {
  public interface square {

    int check(int num);

  }

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

    square isSquare = (num) -> num * num;

    for (int a : numbers) {
      System.out.println(isSquare.check(a));
    }

    /*
     * 
     * Function<Integer, Integer> isSquare = num -> num * num;
     * numbers.forEach(n -> System.out.println(isSquare.apply(n)));
     * 
     */
  }
}
