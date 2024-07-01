import java.util.ArrayList;
import java.util.Arrays;

public class StairCase {

    public static void main(String[] args) {
        staircase(0);
    }

    public static void staircase(int n){
        char[] c =new char[n];
        Arrays.fill(c,' ');
        for (int i = n-1; i >= 0; i--){
            c[i] = '#';
            System.out.println(c);
        }
    }

}
