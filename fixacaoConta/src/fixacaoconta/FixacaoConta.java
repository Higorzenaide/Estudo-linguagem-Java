/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fixacaoconta;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FixacaoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta p1;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter account number: ");
        int numAccount = sc.nextInt();
        
        String clearBuffer = sc.nextLine();
        
        System.out.println("Enter account holder: ");
        String holder = sc.nextLine();
        
        System.out.println("Is there na initial deposit (y/n)? : ");
        char deposit = sc.next().charAt(0);
        
        if(deposit == 'y' || deposit == 'Y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit =sc.nextDouble();
            p1 = new Conta(numAccount,holder,initialDeposit);
        }else{
            p1 = new Conta(numAccount,holder);
        }
        
        p1.statusAcoount();
        System.out.println("Enter a deposit value: ");
        Double value = sc.nextDouble();
        p1.depositar(value);
        p1.statusAcoount();
        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        p1.sacar(value);
        p1.statusAcoount();
        
        
        
    }
    
}
