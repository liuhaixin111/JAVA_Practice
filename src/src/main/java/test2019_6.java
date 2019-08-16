import java.util.ArrayList;
import java.util.Scanner;

public class test2019_6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = inp.nextInt();
        int a = 1;
        int b = 2;
        list.add(1);
        while (true){
            if (a != n) {
                for (int i = 1; i <= b; i++) {
                    list.add(b);
                    a++;
                    if (a == n) {
                        break;
                    }
                }
                b++;
            }else {
                System.out.println(list.get(list.size()-1));
                break;
            }
        }
    }
}