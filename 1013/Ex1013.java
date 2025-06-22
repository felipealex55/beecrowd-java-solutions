import java.io.IOException;
import java.util.Scanner;

public class Ex1013 {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAb = ((a + b + Math.abs(a - b)) / 2);
        
        if (maiorAb < c ) {
            System.out.println(c + " eh o maior");    
        } 
        else {
            System.out.println(maiorAb + " eh o maior");
        }

        sc.close();
    }
}