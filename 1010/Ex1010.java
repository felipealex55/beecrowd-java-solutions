import java.io.IOException;
import java.util.Scanner;

public class Ex1010 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        int codigoUm = sc.nextInt();
        int quantidadeUm = sc.nextInt();
        double valorPecaUm = sc.nextDouble();

        int codigoDois = sc.nextInt();
        int quantidadeDois = sc.nextInt();
        double valorPecaDois = sc.nextDouble();
        
        double soma = ((quantidadeUm * valorPecaUm) + (quantidadeDois * valorPecaDois));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);

        sc.close();
    }
}