public class Overriding {
    public static void name(String name){
        System.out.println("My name is "+ name);
    }    
}

public class Kid extends Overriding{
    public static void name(String name){
        System.out.println("My kid's name is "+ name);
    }
}

public static void main(String []args){
    Overriding.name("Pallavi");
    Kid.name("Saanvi");
}
