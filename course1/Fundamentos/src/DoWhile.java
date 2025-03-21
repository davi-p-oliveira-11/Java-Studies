import java.util.Scanner;

public class DoWhile {

  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    var name = "exit";
    do {
      System.out.println("Enter a name");
      name = scanner.next();
      System.out.println(name);

    } while (!name.equalsIgnoreCase("exit"));
  }

}
