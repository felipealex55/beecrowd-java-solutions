import java.io.IOException;
import java.util.Scanner;
 

public class Ex1019 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

            int TotalSegundos = sc.nextInt();
   
            int horas = TotalSegundos / 3600;
            int minutos = (TotalSegundos % 3600) / 60;
            int segundos =  TotalSegundos % 60;

            System.out.println(horas + ":" +  minutos + ":" + segundos);

        sc.close();
    }
}