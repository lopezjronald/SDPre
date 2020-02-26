import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    double x, y;
    String answer;

    System.out.println("I'm going to find a square root of a number for you.");
    System.out.print("Are you ready? ");
    answer = keyboard.next().toLowerCase();
    while (answer.compareTo("yes") != 0){
      System.out.print("Type in \"Yes\" when ready: ");
      answer = keyboard.next().toLowerCase();
    }

    System.out.print("Give me a number ");
    System.out.print("(No negatives, please.) ");
    x = keyboard.nextDouble();

    while (x < 0){
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew Number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}
