import java.util.*;
public class BinarySearchAttempts {

    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        //Base condition
        int left;
        int right = inputArr.length - 1;
        if(key <= 0)
            return 0;
        return getBinarySearchUnsuccessfulComparisonCount(inputArr, key-1);
    }


    public static void main(String args[] ) throws Exception {
        BinarySearchAttempts bs = new BinarySearchAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
    }

}
