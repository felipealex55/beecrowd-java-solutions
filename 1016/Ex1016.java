import java.io.IOException;
import java.util.Scanner;


public class Ex1016 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int distancia = (y * 2);
        System.out.println(distancia + " minutos");

        sc.close();
    }
} 