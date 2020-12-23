public class Binarysearch {
    public static int binarysearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = (start+end)/2;
            if(key == array[mid]) {
                return mid;
            }
            System.out.println(array[mid]);
            if( key > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid;
    }

    public static void main(String args[]){
        int array[] = {3, 5, 7, 8, 10, 12, 13,15,17,19};
        System.out.println(array.length);
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int key = 1;
        int index = binarysearch(array, key);
        System.out.println(index);
    }
}

