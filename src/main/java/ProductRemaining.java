import java.util.Scanner;
public class ProductRemaining {

    static void RPRE(int arr[], int n)
    {
        if (n == 1) {
            System.out.print(0);
            return;
        }

        int left[] = new int[n];
        int right[] = new int[n];
        int prod[] = new int[n];

        int i, j;
        right[n - 1] = 1;

        for (i = 0; i < n; i++) {
            left[i] = 1;
            for(j = i + 1; j < n; j++) {
                left[i] *= arr[j];
            }
        }

        for (i = n  - 1; i >= 0; i--) {
            right[i] = 1;
            for(j = i - 1; j >= 0; j--) {
                right[i] *= arr[j];
            }
        }

        for (i = 0; i < n; i++) {
            prod[i] = left[i] * right[i];
            System.out.print(prod[i] + " ");
        }

        return;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
    }

}
