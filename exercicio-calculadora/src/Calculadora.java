import java.util.Scanner;

public class Calculadora {
    
    private final static Scanner scanner = new Scanner(System.in);	

    public static void main(String[] args) throws Exception {
        	
        //Opção para o menu geral
        var option1 = -1;
	
	    do{
            System.out.println("===Escolha uma das opções:==="); 
            System.out.println("1 - Realizar uma soma."); 
            System.out.println("2 - Realizar uma subtração."); 
            System.out.println("3 - Realizar uma multiplicação."); 
            System.out.println("4 - Realizar uma divisão."); 
            System.out.println("5 - Elevar um número a potência N."); 
            System.out.println("0 - Sair da calculadora.");

            option1 = scanner.nextInt();

            switch (option1){
                case 1 -> realizarSoma();
                case 2 -> realizarSubtracao();
                case 3 -> realizarMultiplicacao();
                case 4 -> realizarDivisao();
                case 5 -> elevarPotenciaN();
                case 0 -> {
                    System.out.println("Saindo da calculadora.");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida");                          
           }
        } while (option1 != 0);
    }

    public static void realizarSoma(){
        
        double numero1 = 0.0;
        double numero2 = 0.0;
        double numero3 = 0.0;
        double soma;
        //Opção para o menu soma
        var option2 = -1;

        System.out.println("Informe o primeiro número.");
        numero1 = scanner.nextDouble();
        System.out.println("Informe o segundo número.");
        numero2 = scanner.nextDouble();
        soma = numero1 + numero2;
        System.out.println("O resultado da soma é " + soma);
            
        do{
            System.out.println("===Gostaria de informar mais números para continuar a soma?==="); 
            System.out.println("1 - Sim."); 
            System.out.println("2 - Não. Voltar para o menu anterior."); 
                        
            option2 = scanner.nextInt();

            switch (option2){
                case 1 ->{
                    System.out.println("Informe o próximo número."); 
                    numero3 = scanner.nextDouble();
                    soma += numero3;
                    System.out.println("O resultado da soma é " + soma);
                }
                case 2 -> {
                    System.out.println("Voltando pro menu anterior.");
                    //System.exit(0);
                    return;
                }
                default -> System.out.println("Opção inválida");                          
            }
        } while (option2 != 2);
    }

	public static void realizarSubtracao(){
        double numero1 = 0.0;
        double numero2 = 0.0;
        double numero3 = 0.0;
        double subtracao;
        
        //Opção para o menu subtração
        var option3 = -1;
        
		System.out.println("Informe o primeiro número.");
		numero1 = scanner.nextDouble();
		System.out.println("Informe o segundo número.");
		numero2 = scanner.nextDouble();
		subtracao = numero1 - numero2;
		System.out.println("O resultado da subtracao é " + subtracao);
		
		do{
            System.out.println("===Gostaria de informar mais números para continuar a subtracao?==="); 
            System.out.println("1 - Sim."); 
            System.out.println("2 - Não. Voltar para o menu anterior."); 
            			
            option3 = scanner.nextInt();

            switch (option3){
                case 1 ->{
					System.out.println("Informe o próximo número."); 
					numero3 = scanner.nextDouble();
					subtracao -= numero3;
					System.out.println("O resultado da subtracao é " + subtracao);
				}
                case 2 -> {
                    System.out.println("Voltando pro menu anterior.");
                    //System.exit(0);
					return;
                }
                    default -> System.out.println("Opção inválida");                          
            }
        } while (option3 != 2);
	}

	public static void realizarMultiplicacao(){
        double numero1 = 0.0;
        double numero2 = 0.0;
        double multiplicacao;

		System.out.println("Informe o primeiro número.");
		numero1 = scanner.nextDouble();
		System.out.println("Informe o segundo número.");
		numero2 = scanner.nextDouble();
		multiplicacao = numero1 * numero2;
		System.out.println("O resultado da multiplicação é " + multiplicacao);
	}

	public static void realizarDivisao(){
        double numero1 = 0.0;
        double numero2 = 0.0;
        double divisao;
        
		System.out.println("Informe o primeiro número.");
		numero1 = scanner.nextDouble();
		System.out.println("Informe o segundo número.");
		numero2 = scanner.nextDouble();
		divisao = numero1 / numero2;
		System.out.println("O resultado da divisão é " + divisao);
	}

	public static void elevarPotenciaN(){
        double numero1 = 0.0;
        double numero2 = 0.0;
        double potencia;

		System.out.println("Informe o primeiro número.");
		numero1 = scanner.nextDouble();
		System.out.println("Informe o segundo número.");
		numero2 = scanner.nextDouble();
		potencia = Math.pow(numero1, numero2);
		System.out.println("O resultado da potencia de " + numero1 + " elevado a " + numero2 + " é " + potencia);
	}

}

