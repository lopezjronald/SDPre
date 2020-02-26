import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args){
    Scanner keyboard = new Scanner (System.in);
    String entry, pin;
    boolean answer;

    System.out.print("PLEASE CREATE A PIN NUMBER OF 4 DIGITS: ");
    pin = keyboard.next();

    System.out.println("WELCOME TO THE BANK OF JAVA");
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.next();

    while (!entry.equals(pin)){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.next();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS 425.17.");
  }
}
