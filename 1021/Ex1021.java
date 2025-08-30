import java.io.IOException;
import java.util.Scanner;

public class Ex1021 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

            double valor = sc.nextDouble();
            int resultado;

            System.out.println("NOTAS:");

            resultado = (int) valor / 100;
            System.out.printf("%d nota(s) de R$ 100.00\n", resultado);
            valor = valor % 100;

            resultado = (int) valor / 50;
            System.out.printf("%d nota(s) de R$ 50.00\n", resultado);
            valor = valor % 50;

            resultado = (int) valor / 20;
            System.out.printf("%d nota(s) de R$ 20.00\n", resultado);
            valor = valor % 20;

            resultado = (int) valor / 10;
            System.out.printf("%d nota(s) de R$ 10.00\n", resultado);
            valor = valor % 10;
            
            resultado = (int) valor / 5;
            System.out.printf("%d nota(s) de R$ 5.00\n", resultado);
            valor = valor % 5;
            
            resultado = (int) valor / 2;
            System.out.printf("%d nota(s) de R$ 2.00\n", resultado);
            valor = valor % 2;            

            int centavos = (int) Math.round(valor * 100);

            System.out.println("MOEDAS:");

            resultado = centavos / 100;
            System.out.printf("%d moeda(s) de R$ 1.00\n", resultado);
            centavos = centavos % 100;

            resultado = centavos / 50;
            System.out.printf("%d moeda(s) de R$ 0.50\n", resultado);
            centavos = centavos % 50;

            resultado = centavos / 25;
            System.out.printf("%d moeda(s) de R$ 0.25\n", resultado);
            centavos = centavos % 25;

            resultado = centavos / 10;
            System.out.printf("%d moeda(s) de R$ 0.10\n", resultado);
            centavos = centavos % 10;
            
            resultado = centavos / 5;
            System.out.printf("%d moeda(s) de R$ 0.05\n", resultado);
            centavos = centavos % 5;
            
            resultado = centavos / 1;
            System.out.printf("%d moeda(s) de R$ 0.01\n", resultado);
        
        sc.close();
    }
}