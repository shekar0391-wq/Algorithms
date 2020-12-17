import java.util.*;
public class NobleInteger {

    static int nobleNum(int arr[], int n)
    {
        for (int i = 0; i < n; i++ )
        {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] < arr[j])
                    count++;

            if (count == arr[i])
                return 1;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(nobleNum(arr, n) + "\n" );
    }
}
