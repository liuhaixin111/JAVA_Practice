import java.util.Scanner;

public class test2019_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (n<2){
            return;
        }else if (n==2){
            System.out.println(4);
        }else {
            System.out.println(1+n+n*(n-1)/2);
        }
    }
}
