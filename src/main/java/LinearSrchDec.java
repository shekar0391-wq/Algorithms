import java.util.Scanner;
public class LinearSrchDec {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int array[] = new int[count];
        int i = 0;
        for (i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        int index = 0;

        for(i = count -1 ; i >=0 ; i--) {
            if(array[i] == key) {
                index = i;
                break;
            }
        }
        System.out.print( ((count - 1) - index));
    }
}
