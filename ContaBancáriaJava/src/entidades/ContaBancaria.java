package entidades;

public class ContaBancaria {
    private int numeroConta = 0;
    private String nome = "";
    private double saldo = 0;

    public ContaBancaria(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public ContaBancaria(int numeroConta, String nome, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nome = nome;
        depositar(depositoInicial);
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor + 5.00;
    }

    public String toString(){
        return "Account " + numeroConta + ", Holder: "+ nome +", Balance: $ "+ String.format("%.2f", saldo);
    }
}
