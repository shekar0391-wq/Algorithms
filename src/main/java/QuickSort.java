public class QuickSort {

    public static  void sort(int array[]) {
        quickSort(array,0,array.length-1);
    }

    public static void quickSort(int[] array,int start, int end) {
        if(start < end) {
            int p = partition(array,start,end);
            quickSort(array,0,p-1);
            quickSort(array, p + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for(int j = start; j < end; j++){
            if(array[j] <= pivot) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

    public static void main(String args[]){
        int array[] = {10, 4, 5, 6, 8, 9, 7};
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sort(array);
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
