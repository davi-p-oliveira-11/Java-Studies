import java.util.Scanner;

public class Operators {
   
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.printf("2 + 2 is: ");
    var result = scanner.nextInt();
    var isRight = result == 4;
    var isWrong = result != 4;
    System.out.printf("The result is 4 ! (%s)", isRight);
    System.out.printf("The result is 4 ! (%s)", isWrong);
    System.out.printf("The result is 4 ! (%s)", !isWrong);
  }
}
