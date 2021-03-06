import java.util.Arrays;
import java.util.Scanner;
public class QuickSortStrings {

    public String[] names;

    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }

    public static int partition(String[] ar, int start, int end) {
        String pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot.length()) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    public void sort(){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        names = new String[size];

        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }

        quickSort(names, 0, names.length - 1);

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String args[]) {
        QuickSortStrings bs = new QuickSortStrings();
        bs.sort();
    }

}
