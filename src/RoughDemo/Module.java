package RoughDemo;

import java.util.*;

public class Module{
    public static int calculateNumber(int[] digit, int[] freq) {
        int result = 0;
        Map<Integer, Integer> remainderFreq = new HashMap<>();

        // Initialize the remainder frequency map
        for (int i = 0; i < digit.length; i++) {
            int d = digit[i];
            int remainder = d % 11;
            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + freq[i]);
        }
        System.out.println(remainderFreq);
        // Calculate the result modulo 11
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : remainderFreq.entrySet()) {
            int remainder = entry.getKey();
            int frequency = entry.getValue();
          //  System.out.println(remainder + " " +frequency);
           // result = (result + (remainder * frequency) % 11) % 11;
            for (int j=1;j<=frequency;j++){
                sb.append(remainder);
            }

        }
       // System.out.println(Integer.valueOf(String.valueOf(sb)) % 11);
        result = (int) (Long.valueOf(String.valueOf(sb)) % 11);
        return result;
    }

    public static Long modulo(int[] digit, int[] freq){
        Long result = 0L;
        String s = "";


        for(int i =0;i<freq.length;i++){
            int res=0;

            for(int j = 0; j< freq[i];j++){
                res = res*10 + digit[i];

            }

            s += res;
        }

        Long result1 =Long.valueOf(s)%11;
        return result1;
    }

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        int N = 4;
       int[] d = {1,3,1,4};
       int[] f = {3,4,2,1};

        // Read digit and frequency values
//        for (int i = 0; i < N; i++) {
//           // int d = scanner.nextInt();
//            int f = scanner.nextInt();
//            digit.add(d);
//            freq.add(f);
//        }

       // System.out.println("Result modulo 11: " + calculateNumber(d, f));
        System.out.println(modulo(d,f));
    }
}