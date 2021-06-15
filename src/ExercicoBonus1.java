import java.util.Scanner;

public class ExercicoBonus1 {

	public static void main(String[] args) {
		/*1. Escrever um algoritmo para determinar o consumo médio de 
		um automóvel sendo fornecida a distância total percorrida 
		pelo automóvel e o total de combustível gasto.*/ 

		Scanner leitor = new Scanner(System.in);
		
		double totalPercorrido, combustivelGasto, consumoMedio;
		
		System.out.println("Digite o total percorrido:");
		totalPercorrido = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de combustivel gasto:");
		combustivelGasto = leitor.nextDouble();
		
		consumoMedio = totalPercorrido / combustivelGasto;
		
		System.out.println("O consumo médio do seu automóvel é: " + consumoMedio);
		
		

	}

}
