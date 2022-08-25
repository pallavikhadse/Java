

public class SumArrays{
    public static void main(String []args){
        int [] array = {20,10, 25, 50, 30};

        int sum = 0;

        for(int i: array){
            sum = sum+i;
        }

        System.out.println("Sum of all the elements in the given array is " + sum);
    }
}
