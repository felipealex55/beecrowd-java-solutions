import java.io.IOException;
import java.util.Scanner;

public class Ex1002 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
            
         double n = 3.14159;
         double raio = sc.nextDouble();
         double a = (n * Math.pow(raio, 2));
         System.out.printf("A=%.4f\n", a);
         
         sc.close();
    }
}