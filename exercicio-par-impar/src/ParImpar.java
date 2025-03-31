
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int numero1;
		int numero2;
		int escolha;
        int i;
		
		do{
            System.out.println("Digite o primeiro número.");
			numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número, maior que o primeiro.");
			numero2 = scanner.nextInt();

			if(numero2 <= numero1){
                System.out.println("O segundo número deve ser maior e diferente do primeiro.");
			}

		}while(numero2 <= numero1);

        do{
            System.out.println("Escolha 1 - par ou 2 - ímpar para ver todos os número pares ou ímpares no intervalo entre os números.");
            escolha = scanner.nextInt();
            if(escolha != 1 && escolha != 2){
                System.out.println("Opção inválida. A escolha deve ser 1-par ou 2-ímpar.");
            }
        }while(escolha != 1 && escolha != 2);
        

        if(escolha == 1){
            System.out.println("Os números pares no intervalo de " + numero1 + " até " + numero2 + " são:");
            for(i = numero2; i >= numero1; i--){
                if(i % 2 == 0){
                    System.out.println(i);
                } 
            }
        }
        else{
            System.out.println("Os números impares no intervalo de " + numero1 + " até " + numero2 + " são:");
            for(i = numero2; i >= numero1; i--){
                if(i % 2 != 0){
                    System.out.println(i);
                } 
            }
        }
    }
}
