import java.util.Scanner;

public class test2019_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = null;
        int sum = 0;
        int n = inp.nextInt();
        if (n == 0){
            sum = 0;
        }else if (n == 1){
            sum = 1;
        }else {
            while (n > 0){
                str += Integer.toString(n%2);
                n = n/2;
            }
            for (int i=0;i<str.length();i++){
                if (str.charAt(i) == '1'){
                    sum++;
                }
        }
        }
        System.out.println(sum);
    }
}
