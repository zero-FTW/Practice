import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int total = num;
        in.nextLine();
        for (int a = 0; a < num; a++) {
            String str = in.nextLine();
            if (str.indexOf("+one") != -1) {
                total++;
            }
        }
        total += 2;
        if (total == 13) {
            total++;
        }
        System.out.println(total * 100);
    }
}