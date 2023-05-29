package CodingTasks.ibtissam;

public class SwapNumbers {

    public static void main(String[] args) {

      /*  int a = 10  , b = 20;

        System.out.println("Before swap: a = " + a + " b= " + b);

        // swap without 3rd variable:

        a = a+ b;  // 10 + 20 = 30
        b = a-b;   // 30 - 10 = 20
        a = a-b;   // 30 - 20 = 10

        System.out.println("After swap : a= " + a + " b= " + b);*/

        swap2Variables(10, 20);

    }

    public static void swap2Variables(int a, int b){

        a = a + b;
        b =a -b ;
        a = a -b ;

        System.out.println("After swap : a= " + a + ", b= " + b);

    }


}
/*
Swap two  variable values without using a third variable
 */
