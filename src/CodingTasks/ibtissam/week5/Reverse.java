package CodingTasks.ibtissam.week5;

public class Reverse {

    public static void main(String[] args) {

        String str = "ABCD";



     /*   String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);*/

        System.out.println(reverseMethod(str));


    }

    public static String reverseMethod(String str){

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
           reverse += str.charAt(i);

        }
        return reverse;

    }


}
/*
2. Reverse:
  Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
 */
