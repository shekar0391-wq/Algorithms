import java.util.Scanner;
public class ListPrime {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    public static boolean primality_check(int n) {
        if( n <= 1)
            return false;
        if( n <= 3)
            return true;
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for( int i = 5; i < Math.sqrt(n); i++) {
            if( (n%i == 0) || n%(i+2) == 0)
                return false;
        }
        return true;
    }
    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        boolean isPrimeFound = false;
        for(int i = 0; i <=n; i++) {
            if(primality_check(i)){
                  isPrimeFound = true;
                 System.out.print(i + " ");
            }
        }

        if(!isPrimeFound) {
            System.out.println("There are no prime numbers less than "+n);
        }
    }

}
