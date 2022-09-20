package dowhile;
import java.util.Scanner;
import java.util.Locale;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        char resp;
        
        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
        
            double F = 9*C/5 +32.0; 
            System.out.printf("Equivalente em Fahrenheit %.1f%n" , F);

            System.out.println("Deseja repetir (S/N)");
             resp = sc.next().toUpperCase().charAt(0);
        }while(resp != 'N');
        sc.close();
    }
    
}
