package TCS_NQT_Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

// A chocolate factory is packing chocolates into the packets.
// The chocolate packets here represent
// an array  of N number of integer values.
// The task is to find the empty packets(0) of chocolate
// and push it to the end of the conveyor belt(array).
public class Solution {
    public static int[] shift(int[] packets){
        int n = packets.length;
        int[] result = new int[n];
        int idx = 0;
        for(int p : packets){
            if(p != 0){
                result[idx++] = p;
            }
        }
        while(idx < n){
            result[idx++] = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] packets = {4,5,0,1,9,0,5,0};
        int n = packets.length;
        int[] result = shift(packets);
        System.out.println(Arrays.toString(result));
    }
}
