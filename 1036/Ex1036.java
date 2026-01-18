import java.io.IOException;
import java.util.Scanner;

public class Ex1036 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double Delta;
        double R1, R2;

        Delta = (B * B) - 4 * A * C;

        if (A == 0 || Delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
                R1 = (-B + Math.sqrt(Delta)) / (2 * A);
                R2 = (-B - Math.sqrt(Delta)) / (2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }

        sc.close();
    }
}