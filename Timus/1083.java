import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k, total = 1;
        String str = in.nextLine();
        char first = str.charAt(0);
        if (first == '1' && str.charAt(1) == '0') {
            n = 10;
            k = str.length() - 3;
        }
        else {
            n = (int) (first - '0');
            k = str.length() - 2;
        }
        for (int a = 0; a < n; a += k) {
            total *= n - a;
        }
        System.out.println(total);
    }
}