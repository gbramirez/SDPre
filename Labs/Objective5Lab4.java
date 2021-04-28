import java.util.Scanner;
public class Objective5Lab4 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a whole number" );
    int userNum = keyboard.nextInt();

    if(userNum % 2 == 0){
      System.out.println("The number is even. ");
    }
    else {
      System.out.println("The number is odd. ");
    }
  }
}
