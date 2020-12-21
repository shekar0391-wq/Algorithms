import java.util.Scanner;
public class StringSortInsertion {

    public void sortAscending(String firstNames[]){
        String names[] = firstNames;
        for(int i = 1; i < names.length; i++) {
            String v = names[i];
            int j = i;

            while((j >= 1) && (names[j - 1].compareTo(v)) > 0) {
                names[j] = names[j - 1];
                j--;
            }
            names[j] = v;
        }

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public void sortDecending(String lastNames[]){
        String names[] = lastNames;
        for(int i = 1; i < names.length; i++) {
            String v = names[i];
            int j = i;

            while((j >= 1) && (names[j - 1].compareTo(v)) < 0) {
                names[j] = names[j - 1];
                j--;
            }
            names[j] = v;
        }

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
        for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        }
        StringSortInsertion bs = new StringSortInsertion();

        bs.sortAscending(firstNames);
        bs.sortDecending(lastNames);
        //Write your code here
    }
}
