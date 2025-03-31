import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double peso;
	    double altura;
    	double imc;

        System.out.println("Digite seu peso em kg.");
	    peso = scanner.nextDouble();
	
        System.out.println("Digite sua altura em cm.");	
	    altura = scanner.nextDouble();

	    imc = 10000* (peso /(altura*altura));

        System.out.println("Seu IMC é " + imc);	

        if(imc <= 18.5){
            System.out.println("Abaixo do peso.");	
        }
        else if(imc <= 24.9){
            System.out.println("Peso ideal.");	
        }
        else if(imc <= 29.9){
            System.out.println("Levemente acima do peso.");	
        }
        else if(imc <= 34.9){
            System.out.println("Obesidade Grau I.");
        }
        else if(imc <= 39.9){
            System.out.println("Obesidade Grau II (Severa).");
        }
        else{
            System.out.println("Obesidade III (Mórbida).");
        }


    }
}
