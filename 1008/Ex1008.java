import java.util.Scanner;

public class Ex1008 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double valorHorasTrabalhadas = sc.nextDouble();
        double salario = (horasTrabalhadas * valorHorasTrabalhadas);
        
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}