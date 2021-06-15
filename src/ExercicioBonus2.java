import java.util.Scanner;

public class ExercicioBonus2 {

	public static void main(String[] args) {

		/*Faça um algoritmo que calcule o valor da conta de luz de 
		uma pessoa. Sabe-se que o cálculo da conta de luz segue a 
		tabela abaixo: 
		Tipo de Cliente Valor do KW/h 
		1 (Residência) 0,60 
		2 (Comércio) 0,48 
		3 (Indústria) 1,29*/ 
		
		Scanner leitor = new Scanner(System.in);
		
	    int tipoCliente;
		
		double valorConta;
		double consumo;
		
		System.out.println("Digite 1 para imóvel residencial, 2 para Comércio e 3 Industria");
		tipoCliente = leitor.nextInt();
		
		System.out.println("Informar o consumo mensal:");
		consumo = leitor.nextDouble();
		
		if(tipoCliente == 1) {
		valorConta = consumo * 0.60;
		System.out.println("O valor total da sua conta é: " + valorConta);
		}else if (tipoCliente == 2) {
			valorConta = consumo * 0.48;
			System.out.println("O valor total da sua conta é: " + valorConta);
		}else if (tipoCliente == 3){
			valorConta = consumo * 1.29;
			System.out.println("O valor total da sua conta é: " + valorConta);
		}else {
			System.out.println("Por favor, digite os dados corretamente");
		}
		
	}
		
		

}
