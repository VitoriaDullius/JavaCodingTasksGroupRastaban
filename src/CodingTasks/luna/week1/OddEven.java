package CodingTasks.luna.week1;

public class OddEven {

    public  static  String  identifyOddEven(int  n) {
        return  n%2==0 ? "Even" : "odd" ;
    }

    public static void main(String[] args) {
        System.out.println(identifyOddEven(5));
        System.out.println(identifyOddEven(6));
    }
}
