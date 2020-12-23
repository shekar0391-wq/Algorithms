import java.util.ArrayList;
import java.util.Scanner;
public class NumbersOfSubarrayON {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int d = s.nextInt();
        int m = s.nextInt();
        numberOfSubArrays(arr, n, d, m);
    }
    // Method to find number of subarrays of size m whose sum of elements is d
    static void numberOfSubArrays(int[] arr,int n, int d, int m){
        // Write your code here
    }

}
