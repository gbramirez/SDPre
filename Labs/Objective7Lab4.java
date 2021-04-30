public class Objective7Lab4 {
  public static void main(String[] args) {

    int sumTotal = 0;
    int count = 0;

    while(count <= 20) {
      System.out.println (count);
      count = count + 1;
    }
    while(count == 20) {
      System.out.println (sumTotal);
      sumTotal = count ++;
    }
  }
}
