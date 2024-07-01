import java.util.Arrays;
import java.util.List;

public class BreakingBestAndWorstRecord {

    public static void main(String[] args) {
        System.out.println((evaluate(new int[] {12, 24, 10, 24})));

        System.out.println("===============================================");
        
        System.out.println((evaluate(new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1})));

        System.out.println("===============================================");
        
        System.out.println((evaluate(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42})));
    }

    public static List<Integer> evaluate(int[] scores){
        int[] maxMin = {Integer.MIN_VALUE,Integer.MAX_VALUE};
        int[] maxMinCount = {-1,-1};
        for (int score:scores){
            if (score > maxMin[0]){
                maxMin[0] = score;
                maxMinCount[0]++;
            }
            if (score < maxMin[1]){
                maxMin[1] = score;
                maxMinCount[1]++;
            }
        }
        return Arrays.asList(maxMinCount[0], maxMinCount[1]);
    }
}
