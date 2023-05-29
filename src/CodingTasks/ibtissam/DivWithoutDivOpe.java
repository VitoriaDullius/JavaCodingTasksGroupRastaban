package CodingTasks.ibtissam;

public class DivWithoutDivOpe {

    public static void main(String[] args) {

      /*  int a = 50;
        int b = 9;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println(count + " with remainder " + a);

    */

      divisibleWithoutDivOper(30,6);



    }

    public static void divisibleWithoutDivOper(int a, int b){

        int count = 0;

        while (a >= b){
            a -= b;
            count++;
        }
        System.out.println(count + " with remainder " + a);

    }


}
