package CodingTasks.ibtissam;

public class PrintConsecutiveNums {

    public static void main(String[] args) {

        int n = 24;

        for (int i = 1; i <= n ; i++) {
            if (i% 15 == 0){
                System.out.println("CodilityTestCoders");
            } else if (i% 6 ==0) {
                System.out.println("CodilityTest");
            } else if (i % 3 == 0   &&   i %5 == 0 ) {
                System.out.println("TestCoders");
            } else if (i % 5 == 0 ) {
                System.out.println("Coders");
            } else if (i%3 == 0) {
                System.out.println("Test");
            } else if (i % 2 ==0) {
                System.out.println("Codility");
        }else {
                System.out.println(i);
            }

        }




    }
}
/*
write a function:
that given a positive iteger N, prints the consecutive numbers from 1 to N, each on a separate line.
however, any number divisible by 2, 3 or 5 should replced by the word codility, test or coders respectively.
if a number is divisible by more than one of the numbers 2, 3 or 5, it should be replaced by a concatenation of the respective words Codility, test and codes in this given order. for example, numbers divisible by both 2 and 3 should be
replaced by CodilityTest and numbers divisible by all three numbers 2, 3 and 5, should be replced by CodilityTestCoders.

for example here is the output for N = 24:
1
Codility
Test
Codility
Coders
Codilitytest
7
Codility
Test
CodilityCOders
11
CodilityTest
13
COdility
TestCoders
Codility
17


 */
