/*
* Take in the users first name, last name, and age and store them into variables
* Prints out all the received information in the following format:
`First Name: John, Last Name: Smith, Age: 23`.
*/

import java.util.Scanner;

public class Objective3Lab4{
  public static void main(String[] args){
    String firstName, lastName;
    int age;

    Scanner input = new Scanner (System.in);
    System.out.println("What is your first name?");
    firstName = input.next();
    System.out.println("What is your last name?");
    lastName = input.next();
    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.print("First Name: " + firstName + ", ");
    System.out.print("Last Name: " + lastName + ", ");
    System.out.println("Age: " + age);
    input.close();
  }
}
