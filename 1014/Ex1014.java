import java.io.IOException;
import java.util.Scanner;

public class Ex1014 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = sc.nextDouble();
 
        double media = (x / y);

        System.out.printf("%.3f km/l\n", media);

        sc.close();
    }
}