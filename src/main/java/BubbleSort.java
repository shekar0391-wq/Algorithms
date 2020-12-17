import java.util.*;

public class BubbleSort {

    public static void sort(int array[]){
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int array[] = {10, 4, 5, 6, 8, 9, 7};

        System.out.println(array.length);

        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
       System.out.println();
        sort(array);
        for(int item:array)
            System.out.print(item + " ");
    }
}
