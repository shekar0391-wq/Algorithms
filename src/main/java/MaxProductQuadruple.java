import java.util.ArrayList;
import java.util.Scanner;
public class MaxProductQuadruple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];

       for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max =  maxProdQuad(n,arr);
        if(max == -1)
            System.out.println("No Maximum Product Quadruple");
        else
            System.out.println(max);

        for(int i = 0; i < n - 1 ; i++){
            if((arr[i]+1) != arr[i + 1]){
                System.out.print((arr[i] + 1) + " ");
            }
        }

    }

    public static void quicksort(int[] arr, int start, int end){
        if(start < end) {
            int p = partition(arr,start,end);
            quicksort(arr,0,p - 1);
            quicksort(arr, p + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for(int j = start; j < end; j++){
            if(array[j] <= pivot) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

    static int maxProdQuad(int n, int[] arr){
        quicksort(arr, 0, arr.length - 1);
        int len = arr.length - 1;
        if( len < 4)
            return -1;
        int x  = (arr[0] * arr[1] * arr[len] * arr[len - 1]);
        int y = (arr[len - 3]* arr[len - 2] * arr[len - 1] * arr[len]);
        int z = (arr[0]*arr[1]*arr[2]*arr[3]);
        int res = -1;

        if( x > y && x > z) {
            return x;
        }else if(y > x && y > z){
            return y;
        }else if( z > x && z > y) {
            return z;
        }else {
            return res;
        }
    }


}
