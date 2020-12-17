import java.util.Scanner;
public class PowerOfNum {
    // function to calculate base^exponent
    public static int powerfunc(int base, int power) {
        if(power == 0)
            return 1;
        return ( base * powerfunc(base, power-1));
    }



}
