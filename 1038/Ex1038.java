import java.io.IOException;
import java.util.Scanner;

public class Ex1038 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int cod = sc.nextInt();
        int quantidade = sc.nextInt();

        double valor = 0;

        switch (cod) {

            case 1:
                valor = 4.00;
                break;

            case 2:
                valor = 4.50;
                break;

            case 3:
                valor = 5.00;
                break;

            case 4:
                valor = 2.00;
                break;

            case 5:
                valor = 1.50;
                break;

            default:
                break;
        }

        double soma = (valor * quantidade);

        System.out.printf("Total: R$ %.2f\n", soma);

        sc.close();
    }
}
