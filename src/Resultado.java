import java.util.Scanner;

public class Resultado {
	
	void executar() {
		
		// Declaração de Variáveis
				String nomeDoUsuario;
				int pesoDoUsuario;
				double alturaDoUsuario, valorImc;
				Imc imc = new Imc();
				
				// Ler o teclado do usuário
				Scanner leitor = new Scanner(System.in);
				
				// Início
				System.out.println("Qual o seu nome? ");
				nomeDoUsuario = leitor.next();
			
				System.out.print(nomeDoUsuario + ", digite seu peso:\n");
				pesoDoUsuario = leitor.nextInt();		
				
				System.out.print("E a sua altura:\n");
				alturaDoUsuario = leitor.nextDouble();
				
				leitor.close();
				
				//Calculando utilizando a classe Imc
				valorImc = 	imc.calcularImc(pesoDoUsuario, alturaDoUsuario);
				System.out.println(nomeDoUsuario + ", seu IMC é " + valorImc + ".");
				
				System.out.println("-------------------------------------------");
				
				imc.classificarImc(valorImc);
		
	}

}
