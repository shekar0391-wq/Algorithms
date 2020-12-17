public class SelectionSort {

    public static void sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i])
                    min = j;

                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String args[]) {
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
