import java.util.Scanner;

public class QuickSortDecending {

    public int[] array = { 2, 4, 6, 8 ,10, 12,14, 16, 18, 20};

    public static void quickSort(int array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }

    public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j] >= pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    public void sort(){

        quickSort(array, 0, array.length - 1);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static void main(String args[]) {
        QuickSortDecending bs = new QuickSortDecending();
        bs.sort();
    }
}
