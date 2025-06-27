import java.io.IOException;
import java.util.Scanner;

public class Ex1015 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double sub1 = (x2 - x1);
        double sub2 = (y2 - y1);
        double raiz1 = Math.pow(sub1, 2);
        double raiz2 = Math.pow(sub2, 2);
        double soma = (raiz1 + raiz2);
        double raiz3 = Math.sqrt(soma);

        System.out.printf("%.4f\n", raiz3);

        sc.close();
    }
}