import java.util.Scanner;
public class SumOfGP {

    static long sum_of_rn(long r, long n) {
        if(n == 0 ) return 1;
        if(n == 1) return 1+r;
        return (sum_of_rn((long) Math.pow(r,2), n -1));
    }

    static long gp(long a, long r, long n, long m)
    {
       if( n == 0 ) {
           return (a%m);
       }
       if(n == 1) {
           return ( a*(1+r)%m);
       }

       return n;
    }

    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();

        System.out.println(gp(a, r, n, m) + "\n" );
    }
}
