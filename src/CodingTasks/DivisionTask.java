package CodingTasks;

public class DivisionTask {
    public static void main(String[] args) {
        /*
        Divide without this operator: /
        Write a method that can divide two numbers without using division operator
         */


        int n1 = 13;
        int n2 = 4;
        int result= 0;

        while ((n1 >= n2)){
            n1 = n1 -n2;
            result ++;

        }

        System.out.println(result);

        System.out.println("Remainder is: " + n1);




    }
}
