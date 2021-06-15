import java.util.Scanner;

public class ExercicioBonusLista06 {

	public static void main(String[] args) {
		/*6 – Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom 
		“DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um 
		cupom, informando o valor final a ser pago.*/
		Scanner leitor = new Scanner(System.in);
		
		String cupom = "DIADEFESTA";
		String cupomPreenchido;
		double valorCompra, valorTotal;
		
		
		System.out.println("Digite o valor da compra:");
		valorCompra = leitor.nextDouble();
		
		System.out.println("Digite o cumpom de desconto:");
		cupomPreenchido = leitor.next();
		
		if(cupomPreenchido.equalsIgnoreCase(cupom)) {
			valorTotal = valorCompra * 0.97;
			System.out.println("Você ganhou 3% de desconto e o valor total da sua compra é de:" + valorTotal);
		}else {
			System.out.println("O valor total da sua compra é:" + valorCompra);
		}
		
	}

}
