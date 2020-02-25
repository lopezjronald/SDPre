/*
Takes users age and stores it into a variable
Calculates the year the person was born and prints out the
calculated birth year
*/

import java.util.Scanner;
import java.time.YearMonth;

public class Objective3Lab3{
  public static void main(String[] args){
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();

    currentYear = YearMonth.now().getYear();
    birthYear = currentYear - age;
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
