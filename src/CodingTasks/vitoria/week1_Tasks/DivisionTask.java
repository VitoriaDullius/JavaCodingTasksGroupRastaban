package CodingTasks.vitoria.week1_Tasks;

public class DivisionTask {
    public static int DivisionTask( int num1, int num2){

        int count = 0;

        while ((num1 > 0)) {
            num1 = num1 - num2;
            count++;
        }
        return count;

    }

    public static void main (String[]args){
        System.out.println(DivisionTask(6, 2));
    }
}

