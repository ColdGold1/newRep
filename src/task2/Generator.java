package task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        Random r = new Random();
        try(FileWriter writer = new FileWriter("src/task2/file1.txt")){
           for (int i = 0; i < 3000000; i++){
               StringBuilder sb = new StringBuilder();
               sb.append(r.nextInt(255)).append('.').append(r.nextInt(255)).append('.')
                       .append(r.nextInt(255)).append('.').append(r.nextInt(255));
               writer.write(sb.toString() + "\n");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
