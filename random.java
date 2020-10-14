import java.util.*;

class Random {
    public static void main(String[] args) {
       int min = 0;
       int max = 100;

       int random_int = (int)(Math.random() * (max - min + 1) + min);

       int i = 0;

       while (i == 0) {
           System.out.print("Guess the number: ");
           Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

           if (input > random_int) {
               System.out.println("higher");
           }

           if (input < random_int) {
               System.out.println("lower");
           }

           if (input == random_int) {
               i = 1;
               System.out.println("Correct!");
           }
       }
    }
}