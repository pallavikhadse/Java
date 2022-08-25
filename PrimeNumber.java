
public class PrimeNumber{
    public static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
            //System.out.println("Given number is not a prime number!");
        }

        if(n==2){
            return true;
            //System.out.println("Given number is a prime number!");
        }

        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
                //System.out.println("Given number is not a prime number!");
            }
        }
        return true;
        //System.out.println("Given number is a prime number!");
    }

    public static void main (String [] args){
        isPrime(12);
        if(true){
            System.out.println("Given number is prime!");
        }
        
    }

}
