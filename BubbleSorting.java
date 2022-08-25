import java.util.*;

public class BubbleSorting {
    public static void main(String []args){
        int [] array = {70, 10, 50, 40, 20};

        for(int i=0; i<array.length; i++){

            for(int j=0; j<array.length-j-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }                
            
            }
            System.out.println(array[i]);
            
        }
        
    }
    
}
