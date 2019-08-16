import java.util.ArrayList;
import java.util.Scanner;

public class test2019_8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n =0;
        String input = inp.nextLine();
        String[] temp = input.split("\\s+");
        for (int i=0;i<temp.length-1;i++){
            if (Integer.parseInt(temp[i]) > Integer.parseInt(temp[i+1])){
                n++;
            }
        }
        if (n > 1)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
