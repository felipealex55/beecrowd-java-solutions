import java.io.IOException;
import java.util.Scanner;

public class Ex1005 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double media = (double) ((a * 3.5) + (b * 7.5)) / 11;
        System.out.printf("MEDIA = %.5f\n", media); 
        sc.close();
    }
 
}