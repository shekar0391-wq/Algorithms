import java.lang.String;
import java.util.Scanner;

public class PrintAstricks {
    // function to print the required pattern
    public static String func(int n) {
        //write your code here
        String str = new String();

        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        if(n == 1) {
            return str;
        }
        return func(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }


}
