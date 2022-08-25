public class Overloading {
    public static void add(int a, int b){
        int c = a+b;

        System.out.println("Sum of a and b is "+ c);
    }

    public static void add(int a, int b, int c){
        int d = a+b+c;

        System.out.println("Sum of a, b and c is "+ d);
    }
    
    public static void main (String []args){
        add(10, 20);

        add(10, 20, 20);
    }
}
