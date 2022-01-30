import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		// Declaração de Variáveis
		String nomeDoUsuario;
		int pesoDoUsuario;
		double alturaDoUsuario,imc;
		
		// Ler o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		
		// Início
		System.out.println("Qual o seu nome? ");
		nomeDoUsuario = leitor.next();
	
		System.out.print(nomeDoUsuario + ", digite seu peso:\n");
		pesoDoUsuario = leitor.nextInt();		
		
		System.out.print(nomeDoUsuario + ", digite sua altura:\n");
		alturaDoUsuario = leitor.nextDouble();
		
		leitor.close();
		
		imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		
		System.out.println(nomeDoUsuario + ", seu IMC é " + imc);
		
		System.out.println("-------------------------------------------");
		
		// Determinar a classificação do IMC
		if (imc < 18.5) {
			System.out.println("Abaixo do peso.");
			
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal.");
			
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso.");
			
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade I.");
			
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade II.");
			
		} else if (imc >= 40 ) {
			System.out.println("Obesidade III.");
			
		}

	}

}
