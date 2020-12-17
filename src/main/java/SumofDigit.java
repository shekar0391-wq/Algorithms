import java.util.Scanner;
public class SumofDigit {
    public static int sum(int n) {
        //write the logic here
        if(n == 0)
            return 0;
        return(n%10 + sum(n/10));
    }

    public static int func(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func(n/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //System.out.println(func(12));

        //System.out.println(Math.pow(6,6));
        int a=0;
        for (int i = 0; i < num; i++) {
            for (int j = i; j < i * i; j++) {
                for (int k = 0; k < j; k++) {
                    System.out.println(a);
                    a++;
                }
            }
        }

               //





    }
}
