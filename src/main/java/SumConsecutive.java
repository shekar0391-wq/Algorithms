import java.util.Scanner;
public class SumConsecutive {
    public static int sum(int n){
        if(n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            int value = SumConsecutive.sum(n);
            System.out.print(value);
        }
        else{
            System.out.println("Enter a natural number");
        }
    }
}