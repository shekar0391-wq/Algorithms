import java.util.ArrayList;
import java.util.Scanner;
public class NumberPartitioning {

    static void numberOfSubarrays(int[] arr, int n, int d, int m){

        /* Write your code here */
        int i = 0, j = 0;
        int sum = 0, count = 0;

        if(n <= 0)
            System.out.println(count);

        for(i = 0; i < n; i++) {
            sum = 0;
            if( (i + m)  < n ) {
                sum = arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3];
            }
            if(sum == d){
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubarrays(arr, n, d, m);
    }
}
