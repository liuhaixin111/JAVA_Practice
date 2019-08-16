import java.util.Scanner;

public class test2019_7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum = 0;
        for (int i=5;i>=1;i--){
            sum += n/i;
            n %= i;
        }
        System.out.println(sum);
    }
}
