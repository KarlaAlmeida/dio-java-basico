import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) throws Exception {
        
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Escolha o primeiro número.");
            numero1 = scanner.nextInt();
    
            System.out.println("Escolha um número para verificar se a divisão pelo número " + numero1 + " é exata.");
            numero2 = scanner.nextInt();
    
            if(numero2 > numero1){
                while(numero2 % numero1 != 0){
                    System.out.println("O número " + numero2 + " não é divisível pelo número " + numero1);
                    System.out.println("Informe outro número.");
                    numero2 = scanner.nextInt();
                }
        
                System.out.println("O número " + numero2 + " é divisível pelo número " + numero1);
            }
            else{
                System.out.println("O segundo número deve ser maior que o primeiro.");
            }
            
        }while(numero2 <= numero1);
        
    }
}
