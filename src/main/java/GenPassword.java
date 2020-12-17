import java.util.Scanner;
public class GenPassword {

    static void generateComb(char[] arr, int i, String s, int len)
    {
        if (i == 0)
        {
            System.out.println(s);
            return;
        }
        for (int j = 0; j < len; j++)
        {
            String appended = s + arr[j];
            generateComb(arr, i - 1, appended, len);
        }
        return;
    }

    static void genPW(char[] arr, int n)
    {
        for (int i = 1; i <= n; i++)
        {
            generateComb(arr, i, "", n);
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }
}
