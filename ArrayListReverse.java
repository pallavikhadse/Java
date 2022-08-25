import java.util.*;

public class ArrayListReverse{
	public static void main(String []args){
		ArrayList array = new ArrayList();
		array.add("1");
		array.add("2");
		array.add("3");
		array.add("4");
		array.add("5");
		array.add("6");
	
		Collections.reverse(array);
		
		System.out.println(array);
	}	

}