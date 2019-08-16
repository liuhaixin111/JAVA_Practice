import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEST20199 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        String line = bf.readLine();
        String[] worlds = line.split(" ");
        int sum = 0;
        for (int i = 0; i < worlds.length; i++) {
            sum += Integer.valueOf(worlds[i]) - 1;
        }
        System.out.println(sum);
    }
}
