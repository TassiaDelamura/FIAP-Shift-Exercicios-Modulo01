import java.util.Scanner;

public class ExercicioBonusLista04 {

	public static void main(String[] args) {
		 // Um robô de combate só deve ativar sua arma principal quando o inimigo está a 
		 //menos de 70cm de distância. Faça um programa onde o usuário informe a distância do 
		// inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do 
		 //status da arma
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a distancia do inimigo:");
		double distancia;
		
		 distancia = leitor.nextDouble();
		 
		 if(distancia < 70 ) {
			 System.out.println("Ativar Arma");
			
		 }else {
			 System.out.println("Desativar arma");
		 }
		 
		leitor.close();
		
	}

}
