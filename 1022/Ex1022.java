import java.io.IOException;
import java.util.Scanner;

public class Ex1022 {

    public static int simpliMdc(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int n1 = sc.nextInt();
            String barraUm = sc.next();
            int d1 = sc.nextInt();
            String operador = sc.next();
            int n2 = sc.nextInt();
            String barraDois = sc.next();
            int d2 = sc.nextInt();

            if (operador.equals("+")) {

                int numeradorResult = (n1 * d2 + n2 * d1);
                int denominadorResult = (d1 * d2);
                int resultadoMdc = simpliMdc(numeradorResult, denominadorResult);
                int resultDivNumerador = (numeradorResult / resultadoMdc);
                int resultDivDenominador = (denominadorResult / resultadoMdc);

                System.out.println(numeradorResult + "/" + denominadorResult + " = " + resultDivNumerador + "/" + resultDivDenominador);

            } else if (operador.equals("-")) {

                int numeradorResult = (n1 * d2 - n2 * d1);
                int denominadorResult = (d1 * d2);
                int resultadoMdc = simpliMdc(numeradorResult, denominadorResult);
                int resultDivNumerador = (numeradorResult / resultadoMdc);
                int resultDivDenominador = (denominadorResult / resultadoMdc);

                System.out.println(numeradorResult + "/" + denominadorResult + " = " + resultDivNumerador + "/" + resultDivDenominador);

            } else if (operador.equals("*")) {

                int numeradorResult = (n1 * n2);
                int denominadorResult = (d1 * d2);
                int resultadoMdc = simpliMdc(numeradorResult, denominadorResult);
                int resultDivNumerador = (numeradorResult / resultadoMdc);
                int resultDivDenominador = (denominadorResult / resultadoMdc);

                System.out.println(numeradorResult + "/" + denominadorResult + " = " + resultDivNumerador + "/" + resultDivDenominador);

            } else if (operador.equals("/")) {

                int numeradorResult = (n1 * d2);
                int denominadorResult = (n2 * d1);
                int resultadoMdc = simpliMdc(numeradorResult, denominadorResult);
                int resultDivNumerador = (numeradorResult / resultadoMdc);
                int resultDivDenominador = (denominadorResult / resultadoMdc);

                System.out.println(numeradorResult + "/" + denominadorResult + " = " + resultDivNumerador + "/" + resultDivDenominador);

            }
        }
        sc.close();
    }
}