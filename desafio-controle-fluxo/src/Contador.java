import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (IllegalArgumentException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
    }

    public static void contar(int parametroUm, int parametroDois ) throws IllegalArgumentException {
		
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		 if (parametroUm > parametroDois) {
    			 throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
 		 }
		
		//realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;	
        //int numero = parametroUm;
		for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + parametroUm);
            parametroUm++;
		}
    }

}
