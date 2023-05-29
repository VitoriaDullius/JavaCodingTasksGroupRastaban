package CodingTasks.ibtissam;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 6;

       /* if(num % 2 == 0){
            System.out.println(num + " is even number");
        }if(num % 2 != 0) {
            System.out.println(num + " is odd number");
        }*/

        OddOrEven(num);

    }

    public static void OddOrEven(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        }
        if (num % 2 != 0) {
            System.out.println(num + " is odd number");
        }
    }
}
/*
write a method wich can identifies given number is even or odd
 EX:
    identify(5) = "Odd"
    identify(6) = "Even"
 */

