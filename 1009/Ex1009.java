import java.util.Scanner;

public class Ex1009 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        double comissao = (((15 * vendas) / 100) + salario);

        System.out.printf("TOTAL = R$ %.2f\n", comissao);

        sc.close();
    }
}