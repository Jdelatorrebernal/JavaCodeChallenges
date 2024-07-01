import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort1 {

    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(4, 5, 3, 7, 2)));
    }

    public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        List<Integer> output = new ArrayList<>();
        int pivotIndex = 1;
        output.add(arr.get(0));
        for (int i = 1 ; i < arr.size() ; i ++){
             if (arr.get(i) < output.get(pivotIndex-1)){
                 output.add(pivotIndex-1, arr.get(i));
                 pivotIndex++;
             }else{
                 output.add(arr.get(i));
             }
        }
        return output;
    }
}
