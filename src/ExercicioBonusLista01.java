import java.util.Scanner;

public class ExercicioBonusLista01 {

	public static void main(String[] args) {
		//1 � Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele ter� no 
		//dia 31 de dezembro de 2021.
		Scanner leitor = new Scanner(System.in);
		
		int anoNascimento; 
		int resultado;
				
		
		System.out.println("Qual o ano de nascimento");
		 anoNascimento = leitor.nextInt();
		
		resultado = 2021 - anoNascimento;
		
		System.out.println("Ao final de 2021 voc� ter� " + resultado +"anos.");
		

	}


}
