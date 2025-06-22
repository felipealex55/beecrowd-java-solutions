import java.io.IOException;
import java.util.Scanner;

public class Ex1010 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}