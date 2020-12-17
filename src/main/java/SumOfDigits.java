import java.util.Scanner;
public class SumOfDigits {
    static int sumOfDigitsSingle(int n)
    {
        if(n == 0) return n;
        if(n%9 == 0)
            return 9;
        else
            return(n%9);
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}
