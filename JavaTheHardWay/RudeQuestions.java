import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args){
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old. ");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.print("Lastly, what is your favorite hobby? ");
    String hobby = keyboard.next();
    System.out.print(name + ", " + hobby + " is a pretty awesome hobby. ");
    System.out.println("There is still hope for you :)");
  }
}
//Question 1: The program doesn't blow up when I enter an integer questions expecting a double. I think it's because it may convert it into a double when adding a decimal and zero at the end of the integer.
//Question 2: The program does not blow up because numbers and doubles can also be strings. Ex: String num = "24";
//Question 3: When adding a string or double for age and when entering a string type to double type made the system blow up. Java can't recognize it.
//Question 4:
