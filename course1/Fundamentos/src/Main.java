import java.util.Scanner;

public class Main {

    // constant
    private final static String WELCOME_MESSAGE = "Hallo";
    public static void main(String[] args) throws Exception {
        // my comment
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        System.out.print("Hallo, what's your name");
        String name = scanner.nextLine();

        System.out.print("Hallo, what's your name");
        int age = scanner.nextInt();

        System.out.println("Hallo " + name + " your  age is " + age);
        System.out.printf("Hallo %s your age is %s \n", name, age);
    }
}
