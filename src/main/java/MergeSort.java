public class MergeSort {

    public static int[] sort(int array[]) {
        return mergeSort(array,0,array.length-1);
    }

    private static int[] merge(int[] array, int first, int mid, int last) {
        int left = first;
        int right = mid + 1;
        int[] t = new int[array.length];
        int index = 0;

        while( left <= mid && right <= last ) {
            if( array[left] <= array[right] ) {
                t[index] = array[left];
                index++;
                left++;
            } else {
                t[index] = array[right];
                index++;
                right++;
            }
        }

        while(left <= mid) {
            t[index] = array[left];
            index++;
            left++;
        }

        while(right <= last) {
            t[index] = array[right];
            right++;
            index++;
        }

        left = first;
        index = 0;
        while(left <= last) {
            array[left] = t[index];
            left++;
            index++;
        }

        return array;
    }
    public static int[] mergeSort(int[] array,int first, int last) {
        if(first < last) {
            int mid = (first+last)/2;
            mergeSort(array,first,mid);
            mergeSort(array,mid+1,last);
            merge(array,first,mid,last);
        }
        return array;
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
