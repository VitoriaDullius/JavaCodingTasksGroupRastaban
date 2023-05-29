package CodingTasks.ibtissam;

public class DivisibleBy3515 {

    public static void main(String[] args) {

        int n = 100;

        String divisibleBy15 = "",
                divisibleBy5 = "",
                divisibleBy3 = "";

        for (int i = 1; i <= n ; i++) {

            if (i % 15 == 0  &&  i % 3 == 0){
                divisibleBy15 += i + " ";
            }
            if (i % 5 == 0  && i % 15 != 0){
                divisibleBy5 += i + " ";
            }
            if (i% 3 == 0   &&  i %15 != 0){
                divisibleBy3 += i + " ";
            }
        }

        System.out.println("DivisibleBy15: " + divisibleBy15);
        System.out.println("DivisibleBy5: " + divisibleBy5);
        System.out.println("DivisibleBy3: " + divisibleBy3);






    }
}
/*
Write a program that can print the numbers between 1~100 that can be divisible by 3, 5 and 15.
if the number can be divisible by 3, 5 and 15, then should only be displayed in divisibleby 15 section.
if the number can be divisible by 3 but cannot be divisible by 15, then it should be displayed in divisibleBy3 section
if the number can be divisible by 5 but cannot be divisible by 15, then it should be displayed in divisibleBy5 section

ex :
    OutPut:
    divisibleBy15 : 15 30 45 60 75 90
    divisibleBy5 : 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    divisibleBy3 : 3 6 9 12 18 21 24 27 33 36 39 42 48 51 57 63 66 69 72 78 81 84 87 93 96 99

 */
