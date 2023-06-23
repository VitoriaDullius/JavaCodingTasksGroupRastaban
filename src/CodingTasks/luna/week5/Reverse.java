package CodingTasks.luna.week5;

public class Reverse {

    //Solution 1
    public static String StrReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];

        return  reverse;
    }

    //Solution 2
    public  static String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
