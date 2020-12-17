import java.util.Scanner;
public class ListDuplicates {

    static int duplicate(int arr[], int n)
    {
        int count[] = new int[100000];
        int i = 0;
        int duplicate = 0;
        for (i = 0; i <= arr.length; i++) {
            count[arr[i]]++;
            if (count[arr[i]] == 2){
                duplicate = arr[i];
                break;
            }
        }
        return duplicate;
    }
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        System.out.println(duplicate(arr, n));
    }
}
