

import java.util.Scanner;

public class PrimeNUmber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check prime number: ");
    int prime = sc.nextInt();
    PrimeOrNOt(prime);
    sc.close();
  }

  static boolean PrimeOrNOt(int prime) {
    if (prime <= 1) {
      System.out.println(prime + " is not a prime number.");
      return false;
    } else {
      int i = 2;
      while (i <= prime - 1) {
        if (prime % i == 0) {
          System.out.println(prime + " is not a prime number.");
          i++;
          return false;
        } else {
          System.out.println(prime + " is  a prime number.");
          return true;
        }
      }
    }
    return false;
  }
}
