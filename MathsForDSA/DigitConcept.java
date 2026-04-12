package MathsForDSA;

import java.util.*;

public class DigitConcept {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number : ");
    int n = sc.nextInt();

    // Question 1 : to get the number of digits in a number

    // int count = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // n = n / 10;
    // count++;
    // }
    // System.out.println("Number of digits in a number : " + count);
    // TC: O(log10(N))

    // Question 2 : reverse the number

    // int digit = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // digit = digit * 10 + lastDigit;
    // n = n / 10;
    // }
    // System.out.println("The reversed number : " + digit);

    // Question 3 : check whether the number is palindrome or not

    // boolean isPalindrome = false;

    // int m = n;
    // int sum = 0;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // sum = sum * 10 + lastDigit;
    // n = n / 10;
    // }
    // if (sum == m) {
    // isPalindrome = true;
    // }

    // System.out.println("The given number is Palindrome: " + isPalindrome);

    // Question 4 : armstrong number( 153 = (1*1*1)+(5*5*5)+(3*3*3) = 153 )
    // int m = n;
    // int sum = 0;
    // boolean isArmstrong = false;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // sum = sum + (lastDigit * lastDigit * lastDigit);
    // n = n / 10;
    // }

    // if (sum == m) {
    // isArmstrong = true;
    // }

    // System.out.println("The given number is Armstrong : " + isArmstrong);

    // Question 5 : Print all the divisors/factors of the number

    // for (int i = 1; i <= n; i++) {
    // if (n % i == 0) {
    // System.out.print(i + " ");
    // }
    // }
    // TC : O(N)

    // List<Integer> lt = new ArrayList<>();
    // for (int i = 1; i * i <= n; i++) { // Math.sqrt(n)
    // if (n % i == 0) {
    // // System.out.println(i);
    // lt.add(i);
    // if ((n / i) != i) {
    // // System.out.println(n / i);
    // lt.add(n / i);
    // }
    // }
    // }
    // Collections.sort(lt);
    // System.out.println(lt);
    // TC : O(sqrt(n)) // for list it will be different

    // Question 6: check the number is prime or not

    // boolean isPrime = true;
    // for (int i = 2; i * i <= n; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // System.out.println("the number is Prime : " + isPrime);

    // Question 7 : find the GCD/HCF of a number
    // brute force

    System.out.println("Enter two numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int m = Math.min(a, b);
    int gcd = 0;
    for (int i = 1; i < m; i++) {
      if (a % i == 0 && b % i == 0) {
        gcd = i;
      }
    }
    System.out.println("gcd is : " + gcd);
    // TC : O(min(a,b))

    // Euclidean Algorithm => gcd(a,b) = gcd(a-b,b) , where a>b
    // if one of a or b is zero , the other is gcd
    // we can say it as -> gcd(a,b) = gcd(a%b,b)
    // if one of a or b is zero , the other is gcd

    while (a > 0 && b > 0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    if (a == 0) {
      System.out.println(b);
    } else {
      System.out.println(a);
    }
    // TC : O(log(min(a,b)))
  }
}
