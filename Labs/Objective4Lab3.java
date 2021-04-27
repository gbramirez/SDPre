import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the current year. ");
    int year = keyboard.nextInt();

    System.out.println("How old are you? ");
    int age = keyboard.nextInt();

    int birthYear = age - year;

    System.out.print("You were born in ");
    System.out.println(birthYear);

  }
}
