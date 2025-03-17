import java.util.Scanner;

public class Conditional1 {

  public static void main(String[] args) {
     var scanner = new Scanner(System.in);
     System.out.println("What's your name : ");
     var name = scanner.next();
     System.out.println("What's your age: ");
     var age = scanner.nextInt();
     System.out.println("Are you emancipated ? (y/n)");
     var isEmancipated = scanner.next().equalsIgnoreCase("s");

     if (age >= 18) {
       System.out.printf("%s are %s years old, you can drive \n", name, age);
     } else if (age >= 16 && isEmancipated) {
       System.out.printf(" %s besides you being %s years old, you're emancipated and you can drive \n", name, age);
     } else {
       System.out.printf("%s, you cannot drive \n", name);
     }
     
     System.out.println("End of the program ");
  }
}
