import java.io.IOException;
import java.util.Scanner;

public class Ex1017 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt();
        int velocidade = sc.nextInt();
        double distancia = horas * velocidade;
        double litros = distancia / 12;
        System.out.printf("%.3f\n", litros);
 
        sc.close();
    }
}
