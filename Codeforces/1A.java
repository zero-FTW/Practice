import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int column, row = 0;
        if (a > b) {
            row = (b + c - 1) / c;
            column = (a + c -1) / c;
        }
        else if (a < b) {
            row = (a + c -1) / c;
            column = (b + c - 1) / c;   
        }
        else {
            column = (b + c - 1) / c;
            row = column;
        }
        long result = (long) row * (long) column;
        System.out.println(result);
    }
}