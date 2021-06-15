import java.util.Scanner;

public class ExercicioBonusLista05 {

	public static void main(String[] args) {
	   /* Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso. 
		Entre os pesos de 3 lixos informados pelo usuário, um programa deve indicar qual deles 
		deve ser carregado pelo drone*/
		
		Scanner leitor = new Scanner(System.in);
		
		int lixo1, lixo2, lixo3;
		
		 System.out.println("Digite o peso do lixo 1");
		lixo1 = leitor.nextInt();
		
		 System.out.println("Digite o peso do lixo 2");
		lixo2 = leitor.nextInt();
		
		 System.out.println("Digite o peso do lixo 3");
		lixo3 = leitor.nextInt();
		
		if(lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O lixo 1 será carregado");
		}else if (lixo2 < lixo1 && lixo2 < lixo3){
		    System.out.println("O lixo 2 será carregado");
			}else if (lixo3 < lixo2 && lixo3 < lixo1){
				System.out.println("O lixo 3 será carregado");
			}else {
				System.out.println("Todos os lixos tem o mesmo peso, nenhum lixo será carregado.");
			}
		//Melhorar com switch
		leitor.close();
		}
		  
	

	}

