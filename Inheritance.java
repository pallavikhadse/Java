public class Inheritance {
    public static void employee(){
        System.out.println("Name: Thomas");
    }
}

public static class Member extends Inheritance {
    public static void memberInfo(){
        System.out.println("Name: Tom");
        System.out.println("Id: 23450");
    }
}

public static class Combine {
    public static void main(String []args){
        Inheritance.employee();
        Member.memberInfo();
    }
}
