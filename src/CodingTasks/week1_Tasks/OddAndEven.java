package CodingTasks.week1_Tasks;

public class OddAndEven {
    public static void main(String[] args) {
        /*
        Write a method which can identifies if given number is even or odd
        EX:
               identify(5) -> "odd"
               identify(6) -> "Even"
         */

        int num = 15;


        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}
