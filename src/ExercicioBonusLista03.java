import java.util.Scanner;

public class ExercicioBonusLista03 {

	public static void main(String[] args) {
		//3 – Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar 
		//uma terceira variável, troque os valores de A e B entre si
		Scanner leitor = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um número inteiro correspondente a A");
		a = leitor.nextInt();
		
		System.out.println("Digite em número inteiro correspondente a B");
		b = leitor.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println("Agora o valor de a é " + a + " e o valor de b é " + b );
		
		
		leitor.close();
	}

}
