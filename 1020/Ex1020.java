import java.io.IOException;
import java.util.Scanner;


public class Ex1020 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
         
            int idadeDias = sc.nextInt();
            int restoDias;

            int ano = (idadeDias / 365);         
            restoDias = idadeDias % 365;
            
            int mes = (restoDias / 30);
            int dias = restoDias % 30;

            System.out.println(ano + " ano(s)");
            System.out.println(mes + " mes(es)");
            System.out.println(dias + " dia(s)");

        sc.close();
    }
}