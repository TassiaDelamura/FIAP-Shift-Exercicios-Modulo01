import java.util.Scanner;

public class ExercicioBonus2 {

	public static void main(String[] args) {

		/*Fa�a um algoritmo que calcule o valor da conta de luz de 
		uma pessoa. Sabe-se que o c�lculo da conta de luz segue a 
		tabela abaixo: 
		Tipo de Cliente Valor do KW/h 
		1 (Resid�ncia) 0,60 
		2 (Com�rcio) 0,48 
		3 (Ind�stria) 1,29*/ 
		
		Scanner leitor = new Scanner(System.in);
		
	    int tipoCliente;
		
		double valorConta;
		double consumo;
		
		System.out.println("Digite 1 para im�vel residencial, 2 para Com�rcio e 3 Industria");
		tipoCliente = leitor.nextInt();
		
		System.out.println("Informar o consumo mensal:");
		consumo = leitor.nextDouble();
		
		if(tipoCliente == 1) {
		valorConta = consumo * 0.60;
		System.out.println("O valor total da sua conta �: " + valorConta);
		}else if (tipoCliente == 2) {
			valorConta = consumo * 0.48;
			System.out.println("O valor total da sua conta �: " + valorConta);
		}else if (tipoCliente == 3){
			valorConta = consumo * 1.29;
			System.out.println("O valor total da sua conta �: " + valorConta);
		}else {
			System.out.println("Por favor, digite os dados corretamente");
		}
		
	}
		
		

}
