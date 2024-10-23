package aplicacao;
import entidades.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta;
        
        System.out.println("Enter account number:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder:");
        String nome = sc.nextLine();
        System.out.println("Is there an initial deposit(y/n)?");
        char op = sc.next().charAt(0);
            if(op == 'y'){
                System.out.println("Enter initial deposit value:");
                double depositoInicial = sc.nextDouble();
                conta = new ContaBancaria(numero, nome, depositoInicial);
            }else{
                conta = new ContaBancaria(numero, nome);
            }

        System.out.println("Account data:");
        System.out.println(conta.toString());
        
        System.out.println("Enter a deposit value:");
        conta.depositar(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(conta.toString());

        System.out.println("Enter a withdraw value:");
        conta.sacar(sc.nextDouble());
        
        System.out.println("Updated account data:");
        System.out.println(conta.toString());

        sc.close();
    }
}
