import java.util.Scanner;

public class ExercicoBonus1 {

	public static void main(String[] args) {
		/*1. Escrever um algoritmo para determinar o consumo m�dio de 
		um autom�vel sendo fornecida a dist�ncia total percorrida 
		pelo autom�vel e o total de combust�vel gasto.*/ 

		Scanner leitor = new Scanner(System.in);
		
		double totalPercorrido, combustivelGasto, consumoMedio;
		
		System.out.println("Digite o total percorrido:");
		totalPercorrido = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de combustivel gasto:");
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = totalPercorrido / combustivelGasto;
		
		System.out.println("O consumo m�dio do seu autom�vel �: " + consumoMedio);
		
		

	}

}
