import java.util.Scanner;

public class ExercicioBonusLista03 {

	public static void main(String[] args) {
		//3 � Solicite ao usu�rio a digita��o de 2 n�meros inteiros, nas vari�veis A e B. Sem usar 
		//uma terceira vari�vel, troque os valores de A e B entre si
		Scanner leitor = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite um n�mero inteiro correspondente a A");
		a = leitor.nextInt();
		
		System.out.println("Digite em n�mero inteiro correspondente a B");
		b = leitor.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		
		System.out.println("Agora o valor de a � " + a + " e o valor de b � " + b );
		
		
		leitor.close();
	}

}
