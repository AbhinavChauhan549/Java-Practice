package Java8.LambdaFunction;

import java.util.Arrays;

public class CustomFunctional {

  public interface Custom {

    int operate(int a, int b);

  }

  public static void main(String[] args) {

    int a = 2, b = 3;

    Custom add = (num1, num2) -> num1 + num2;
    System.out.println(add.operate(a, b));

    Custom sub = (num1, num2) -> num1 - num2;
    System.out.println(sub.operate(a, b));

    Custom multi = (num1, num2) -> num1 * num2;
    System.out.println(multi.operate(a, b));

    Custom div = (num1, num2) -> num1 / num2;
    System.out.println(div.operate(a, b));
  }

}
