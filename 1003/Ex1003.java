import java.io.IOException;
import java.util.Scanner;

public class Ex1003 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
}