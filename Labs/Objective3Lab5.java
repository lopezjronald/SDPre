/*
* Create a class structure with the name `Objective3Lab5`.
* Create a main method.
* Create a scanner.
  * Take in two numbers and store them into variables.
  * **Hint** Use `input.nextDouble()` to have decimal precision.
* Calculate and print the result of summing these two values.
*/

import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);

    double numOne, numTwo;
    System.out.println("Please enter a number:");
    numOne = keyboard.nextDouble();
    System.out.println("Please enter another number:");
    numTwo = keyboard.nextDouble();
    System.out.print("The sum of " + numOne + " + ");
    System.out.println(numTwo + " = " + (numOne+numTwo));
    keyboard.close();
  }
}
