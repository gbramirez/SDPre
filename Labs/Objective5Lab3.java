import java.util.Scanner;
public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int equalTo = 0;

    System.out.println("Please enter a number: ");
    int userNum = scanner.nextInt();

    if (userNum >= equalTo) {
      System.out.println("The number is positive");
    }
    else {
      System.out.println("The number is negative");
    }
  }
}
