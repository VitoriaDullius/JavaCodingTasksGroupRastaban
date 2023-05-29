package CodingTasks.ibtissam;

public class Finra {

    public static void main(String[] args) {

        int number = 10;

        if (number %3 == 0  && number % 5 == 0){
            System.out.println("FINRA");

        }else if (number % 3 == 0) {
            System.out.println("FIN");

        }else if (number % 5 == 0){
            System.out.println("RA");
        }


    }

}
/*
write a method wich prints out the numbers from 1 to 30 but numbers which are a multiple of 3print"FIN" instead of the number and for numbers which are a multiple of 5, print"RA" instead of the number. for which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
