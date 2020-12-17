import java.util.Scanner;

public class TimeComplexity {

    public static void fun(int n) {
        int a = 0;
        if (n <= 1)
            return;
        for (int i = 1; i <= n; i++)
            a++;
        System.out.println(0.8 * n);
        fun((int) (0.8 * n));
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        fun(n);

    }

}
