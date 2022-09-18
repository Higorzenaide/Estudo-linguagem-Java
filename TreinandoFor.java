package TreinandoFor;

import java.util.Scanner;

public class TreinandoFor {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int soma = 0;
        System.out.println("Quantas vezes deseja ler um numero: ");
        int N = Ler.nextInt();
                
        for(int i=0; i<N; i++){
            System.out.println("Digite o numero que queira somar: ");
            int x = Ler.nextInt();
            soma = soma + x;
        }
        System.out.println("O resultado e: " + soma);
    }
}
