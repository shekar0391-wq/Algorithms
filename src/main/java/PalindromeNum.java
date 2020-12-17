import java.util.Scanner;

public class PalindromeNum {

    public static boolean palindrome(int[] num, int index) {
        int end = (num.length - 1) - index;

        if((num[index] == num[end]) && (index == end)){
            return true;
        }
        if(num[index] != num[end])
        {
            return false;
        }
        if( index < end+1) return palindrome(num, index + 1);
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
    }
}
