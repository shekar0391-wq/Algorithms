public class InsertionSort {

    public static void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
                int key = array[i];
                int j = i - 1;

                while( j >= 0 && array[j] > key){
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
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
       // for(int item:array)
         //   System.out.print(item + " ");
    }
}
