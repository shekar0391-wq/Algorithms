import java.util.Scanner;
public class Parenthesis {
    static void cobp(char str[], int n)
    {
        if ( n <= 0) {
            return;
        }
        if( n >= 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("{}");
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            str[i] = '{';
        }
        for(int i = n; i < n*2; i++){
            str[i] = '}';
        }
        if(n > 1) {
            System.out.print(str);
        }
    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char[] str = new char[2 * n];
        cobp(str, n);
    }
}
