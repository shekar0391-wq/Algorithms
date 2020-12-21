import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortNswaps {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;
        int[] numbers = array;

        for (int i = 0; i < M; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] < numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;
    }

    public static void main(String args[]){
        BubbleSortNswaps bs = new BubbleSortNswaps();
        Scanner scanner = new Scanner(System.in);
        int noOfIter = scanner.nextInt();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(totalBubbleSortSwaps(array, noOfIter));
    }

}
