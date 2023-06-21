package CodingTasks.vitoria.week1_Tasks;

public class Odd_andEven {
        /*
        Write a method which can identifies if given number is even or odd
        EX:
               identify(5) -> "odd"
               identify(6) -> "Even"
         */
        public  static  String  identifyOddEven(int  n) {
            return  n%2==0 ? "Even" : "odd" ;
        }

        public static void main(String[] args) {
            System.out.println(identifyOddEven(5));
            System.out.println(identifyOddEven(6));
        }

}
