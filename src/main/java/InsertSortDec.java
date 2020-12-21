import java.util.Scanner;
public class InsertSortDec {

    public void insertionSort(int[] inputArr) {
        int count = 0;
        int[] array = inputArr;
        for( int i =1 ;i< array.length;i++){
            int v = array[i];
            int  j= i;

            while(j>=1 && array[j-1]<v){
                array[j]=array[j-1];
                j--;
            }

            array[j]=v;
        }

        for(int i= 0; i < array.length; i++ ) {
            System.out.println(array[i]);
        }
    }


    public static void main(String args[]){
        InsertSortDec bs = new InsertSortDec();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        bs.insertionSort(array);
    }
}
