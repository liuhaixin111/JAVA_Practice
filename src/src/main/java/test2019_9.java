import java.util.Scanner;

public class test2019_9 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
        String t = inp.nextLine();
        int sum = 0;
        String[] temp = t.split(" ");
        for (int i=0;i<temp.length;i++){
            sum += Integer.parseInt(temp[i])-1;
        }
        System.out.println(sum);
    }
}
