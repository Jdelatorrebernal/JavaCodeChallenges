import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class SimpleFactorial {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int[] input = new int[n];

        String[] values = bufferedReader.readLine().split(" ");
        int i = 0;
        for (String v: values){
            input[i++] = Integer.parseInt(v);
        }
        System.out.println(calculateResult(input));
    }

    public static BigInteger calculateResult(int[] input){
        BigInteger sum = BigInteger.ZERO;
        Map<Integer,Long> cache = new HashMap<>();
        for (int n: input){
            sum = sum.add(BigInteger.valueOf(calculateFactorial(n, cache)));
        }
        return sum = sum.mod(BigInteger.valueOf(107));
    }

    public static Long calculateFactorial(int n, Map<Integer, Long> cache){
        Long l = 0L;
        if ( n <= 1){
            l = 1l;
        }else if (cache.containsKey(n)){
            l = cache.get(n);
        }else{
            l = n * calculateFactorial(n-1, cache);
            cache.put(n,l);
        }
        return l;
    }

}
