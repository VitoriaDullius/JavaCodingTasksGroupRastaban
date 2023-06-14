package CodingTasks.ibtissam.week3;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 25;

        boolean isPrime = false;

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
            if(isPrime == true) {
                System.out.println(num + " is not prime number");
            }else {
                System.out.println(num + " is prime");
            }



    }

    // make it as a method
   // public static boolean isPrime()

}
/*

1️⃣ Numbers -- PrimeNumber
Write a method that can check if a number is prime or not
 */
