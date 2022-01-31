
public class Imc {
	
	double calcularImc(int pesoDoUsuario, double alturaDoUsuario) {
		
		double imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);	
		return imc;
		
	}
	
	void classificarImc(double imc) {
		
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
			
		} else {
			System.out.println("Obesidade III.");
			
		}
	
		
	}

	
}
