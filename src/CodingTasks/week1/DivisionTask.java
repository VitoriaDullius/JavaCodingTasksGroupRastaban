package CodingTasks.week1;

public class DivisionTask {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        int count = 0;

        while (a >= b) {
            a = a - b;
            count++;
        }

        System.out.println(count + " with a remainder of " + a);

        /*
        Divide without this operator: /
        Write a method that can divide two numbers without using division operator
         */
    }
}
