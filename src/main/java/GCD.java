import java.util.Scanner;
public class GCD {
    static int gcd(int x, int y)
    {
        if (x == 0) return y;
        if (y == 0) return x;
        if (x == y) return x;
        if (x > y) return gcd(x-y, y);
        return gcd(x, y-x);
    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println(gcd(x, y) + "\n" );
    }
}
