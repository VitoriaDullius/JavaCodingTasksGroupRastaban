package CodingTasks.Milan.Week3_Tasks;

public class PrimeNumber {



    // prime numbers are numbers  greater than 1, and divisible ONLY by 1 and it itself


       public static boolean isPrime(int number) {

           if(number < 2) {
               return false;
           }

           for (int i = 2; i <= number; i++) {
               if (number % i == 0) {
                   return false;
               }
           }

           return true;

       }

    public static void main(String[] args) {

        System.out.println(isPrime(19));
    }




}
