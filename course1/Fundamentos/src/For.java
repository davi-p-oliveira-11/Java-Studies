import java.util.Scanner;

public class For {
  
   public static void main(String[] args) {
     
      for (var i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
           continue;
        }

         System.out.println(i);
       }
     }
   }

