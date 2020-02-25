import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    double m, kg, bmi;

    System.out.print("Your heigh in m: ");
    m = keyboard.nextDouble();

    System.out.print("Your weigh in kg: ");
    kg = keyboard.nextDouble();

    bmi = kg / (m * m);
    System.out.println("Your BMI is " + bmi);

    double pounds, inches;
    System.out.print("Your height in inches: ");
    inches = keyboard.nextDouble();
    m = inches * 0.0254;

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();
    kg = pounds * 0.453592;

    bmi = kg / (m * m);
    System.out.println("You BMI is " + bmi);

    double feet;
    System.out.print("Your height (feet only): ");
    feet = keyboard.nextDouble();
    System.out.print("Your height (inches): ");
    inches = keyboard.nextDouble();
    m = (feet * 0.3048) + (inches * 0.0254);

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();
    kg = pounds * 0.453592;

    bmi = kg / (m * m);
    System.out.println("Your BMI is " + bmi);
  }
}
