/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixacaoconta;

/**
 *
 * @author Administrator
 */
public final class Conta {
    
    private boolean account;
    private int numeroConta;
    private String nomeTitular;
    private double depositoInicial;

    public Conta() {
    }

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        account = true;
    }

    public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
        account = true;
    }

    public boolean isAccount() {
        return account;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
    
    public void statusAcoount(){
        if(this.isAccount() == true){
            System.out.println("Account: " + this.getNumeroConta()+ "\nHolder: "+ this.getNomeTitular() + "\nBalance: " + String.format("%.2f", this.getDepositoInicial()));
        }else{
            System.out.println("E necessario criar ao menos uma conta");
        }
    }
    public void depositar(double deposito){
        depositoInicial += deposito;
    }
    
    public void sacar(double saque){
        depositoInicial = (depositoInicial - saque) - 5;
    }
}
