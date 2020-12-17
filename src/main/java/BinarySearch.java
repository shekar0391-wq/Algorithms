public class BinarySearch {

    public static int BinarySearch(int array[], int key) {
     int start = 0;
     int end = array.length - 1;
     int mid = 0;
     while(start <= end) {
         mid = (start+end)/2;
         if(key == array[mid]) {
             return mid;
         }
         if( key > array[mid]) {
             start = mid + 1;
         } else {
             end = mid - 1;
         }
       }
     return mid;
    }

    public static void main(String args[]){
        int array[] = {1, 4, 5, 6, 8, 9, 11};
        System.out.println(array.length);
        for(int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int key = 10;
        int index = BinarySearch(array, key);
        System.out.println(index);
    }
}
