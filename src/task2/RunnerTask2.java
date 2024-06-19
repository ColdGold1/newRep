package task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;

public class RunnerTask2 {
    private static final int HALF_IP = (int) ((1L << 31) - 1);

    public static void main(String[] args) {
        System.out.println("total memory = " + Runtime.getRuntime().totalMemory());
        //HashSet<String> setOfIPv4 = new HashSet<String>();
        BitSet bs1 = new BitSet(HALF_IP);
        BitSet bs2 = new BitSet(HALF_IP);
        try (BufferedReader br = new BufferedReader(new FileReader("src/task2/file1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                long ip = ipToInt(s);
                if (ip > HALF_IP) {
                    bs2.set((int) (ip - HALF_IP));
                } else {
                    bs1.set((int) (ip));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long result = (long) bs1.cardinality() + (long) bs2.cardinality();
        //System.out.println("used memory = " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("cardinality = " + result);
    }

    private static long ipToInt(String s) {
        String[] s1 = s.split("\\.");
        long result = 0;
        for (int i = 0; i < s1.length; i++) {
            long k = Integer.parseInt(s1[i]);
            result = (result << 8) + k;
        }
        return result;
    }
}
