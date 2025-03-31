import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        var male = new Person("John");
        male.incAge();
        var female = new Person("Mary");
        female.incAge();
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("FePerson name: " + female.getName() + " age: " + female.getAge());
    }
}
