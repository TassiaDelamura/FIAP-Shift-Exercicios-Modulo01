import java.util.Scanner;

public class ListaBonusExercicio8 {
	// 8 � Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a m�dia. Fa�a um programa onde o professor informe a m�dia e as 
	//notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior � m�dia e quantos tiveram nota inferior � m�dia.

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double nota, media;
		int  quantidadeAlunos = 5;
		int acimaDaMedia = 0;
		int abaixoDaMedia = 0;
		int contador = 0;
		
		System.out.println("Programa que calcula a m�dia dos alunos");
		
		media = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de alunos");
		
		quantidadeAlunos = leitor.nextInt();
		
		
		while (contador < quantidadeAlunos)
		{
			System.out.println("Digite a nota dos alunos");
			nota = leitor.nextDouble();
			if(nota < media) {
				abaixoDaMedia = abaixoDaMedia +1;
			}else {
				acimaDaMedia = acimaDaMedia +1;
			}
		}
		
		contador = contador +1;
		
		System.out.print("O total da m�dia �: "+ acimaDaMedia + "e o total de alunos coma nota nota abaixo da m�dia � de" + abaixoDaMedia );
		
		leitor.close();
		

	}

}
