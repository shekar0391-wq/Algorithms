import java.util.Scanner;
public class FactorialNonZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));
    }

    public static int getFactorial(int n) {
        int factO = 1;
        for(int i = n; i >=1; i--){
            factO = factO*i;
        }
        return factO;
    }


    // Method to find the last digit of n!
    static int lastNonZeroDigit(int n) {
        // Write your code here
        int factO = getFactorial(n);

        if(factO%10 != 0){
            return (factO%10);
        }

        if(factO%100 != 0) {
            return (factO%100)/10;
        }

        if(factO%1000 != 0) {
            return (factO%1000)/100;
        }

        if(factO%10000 != 0) {
            return (factO%10000)/1000;
        }
        return 0;
    }
}
