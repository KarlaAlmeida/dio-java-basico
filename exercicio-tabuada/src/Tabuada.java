import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {

        int numero;
        int n;
        int numeroTabuada;
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para visualizar sua tabuada.");
		
		numero = scanner.nextInt();

		for(n = 1; n<=10; n++){
			numeroTabuada = n*numero;
            System.out.println(numero + " x " + n + " = " + numeroTabuada);
		}
    }
}
