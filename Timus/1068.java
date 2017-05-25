import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int a = in.nextInt();
        int total = 1;
        if (a > 1) {
            for (int i = a; i > 1; i--) {
                total += i;
            }
        }
        else {
            for (int i = a; i < 1; i++) {
                total += i;
            }
        }
        System.out.println(total);
    }
}