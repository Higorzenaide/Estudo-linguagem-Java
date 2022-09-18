package pkgswitch;
import java.util.Scanner;
public class Switch {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia;
        System.out.println("Insira um numero de 1 a 7");
        dia = ler.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }
    }
}

