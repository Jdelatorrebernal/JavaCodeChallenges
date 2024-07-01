import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        System.out.println(evaluateCandles(Arrays.asList(4, 4, 1, 3)));
        System.out.println("=========================");
        System.out.println(evaluateCandles(Arrays.asList(3, 2, 1, 3)));
        System.out.println("=========================|");
    }

    public static int evaluateCandles(List<Integer> candles){
        int maxCount = 0;
        int maxCandle = Integer.MIN_VALUE;
        for (int candle:candles){
            if (candle > maxCandle){
                maxCount = 1;
                maxCandle = candle;
            }else if (candle == maxCandle){
                maxCount++;
            }
        }
        return maxCount;
    }
}
