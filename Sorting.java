import java.util.*;

public class Sorting{
	public static void main (String []args){
		int []array = {10, 50, 80, 40, 30};
		
		Arrays.sort(array);

		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		} 
	}
}