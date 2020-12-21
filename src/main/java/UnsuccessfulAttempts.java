import java.util.*;
public class UnsuccessfulAttempts {
    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        int count = 0;
        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i] == key)
                break;
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        UnsuccessfulAttempts bs = new UnsuccessfulAttempts();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(bs.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }

}
