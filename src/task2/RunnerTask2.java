package task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class RunnerTask2 {
    public static void main(String[] args) {

        HashSet<String> setOfIPv4 = new HashSet<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/task2/file1.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                boolean b = setOfIPv4.add(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(setOfIPv4.size());
    }
}
