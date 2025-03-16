import java.util.Locale;
import java.util.Scanner;

/**
*@author  Karla Almeida
*@version 1.0
*@since   16/03/2025
*/

//Este projeto é utilizado para receber os dados de um cliente para criação da conta no banco

public class ContaTerminal {
    
    public static void main(String[] args) {
        
        System.out.println("Olá!Bem vindo ao nosso banco. Por favor, informe os dados solicitados a seguir:");
        
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o número da sua agência (xxx-x)");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta (4 dígitos)");
        int conta = scanner.nextInt();

        System.out.println("Digite o valor do seu saldo inicial");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, " + nome + " " + sobrenome + ". Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , sua conta é " + conta + " e seu saldo, " + saldo + " , já está disponível para saque.");
        
    }
}
