import java.util.Scanner;

public class ExercicioBonusLista02 {

	public static void main(String[] args) {
		// Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos, 
		//solicite ao usu�rio que digite o tempo de um filme em minutos e informe a dura��o 
		//desse filme em horas e em segundos.
		Scanner leitor = new Scanner(System.in);
		
		double segundos, minutos, horas;
		
		
		System.out.println("Digite o tempo do filme em minutos");
		minutos = leitor.nextInt();
		
		horas = minutos / 60;
		segundos = minutos * 60;
		
		System.out.println("O filme tem a dura��o de " + horas +" horas");
		System.out.println("O filme tem a dura��o de " + segundos + "segundos");
		
		leitor.close();
		
	}
}
		
		
		



