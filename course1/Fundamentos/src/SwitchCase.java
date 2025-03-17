import java.util.Scanner;

public class SwitchCase {

   public static void main(String[] args) {
      var scanner = new Scanner(System.in);
      System.out.println("Enter a Numberr starting 1 to 7");
      var option = scanner.nextInt();
      switch (option) {
        case 1:
        case 7:
          System.out.println("Weekend !");
          break;
        case 2:
          System.out.println("Monday");
          break;
        case 3:
          System.out.println("Tuesday");
          break;
        case 4:
          System.out.println("Wednesday");
          break;
        case 5:
          System.out.println("Thrusday");
          break;
        case 6:
          System.out.println("Friday");
          break;
        default:
          System.out.println("Invalid option");
      }
   }

}
