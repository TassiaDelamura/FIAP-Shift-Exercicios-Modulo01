import java.util.Scanner;

public class ExercicioBonus3{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        String nomeCandidato;
        int tempoExperiencia = 0, idade, pontuacao, titulacao;
        
        System.out.println("Por favor, digite seu nome.");
        nomeCandidato = leitor.next();

        System.out.println("Por favor, digite seu idade.");
        idade = leitor.nextInt();

        if (idade < 40)
        {
            pontuacao = 100;
        }
        else
        {
            pontuacao = -50;
        }

        System.out.println("Por favor, digite: \n1 - para 2° grau \n2 - para Graduação \n3 - para Pós-graduação.");
        titulacao = leitor.nextInt();

        if(titulacao == 1)
        {
            pontuacao = pontuacao + 50;
            System.out.println(nomeCandidato + " sua pontuação é de" + pontuacao);

        }
        else if(titulacao == 2)
        {
            System.out.println("Digite: \n1 - para tempo de experiência até 4 anos \n2 - para tempo de experiência superior a 4 anos");
            tempoExperiencia = leitor.nextInt();

            if (tempoExperiencia == 1)
            {
                pontuacao = pontuacao + 70;
                System.out.println(nomeCandidato + " sua pontuação é de " + pontuacao);

            }
            else 
            {
                pontuacao = pontuacao + 90;
                System.out.println(nomeCandidato + " sua pontuação é de " + pontuacao);
            }
        }
        else if(titulacao == 3)
        {
            System.out.println("Digite: \n1 - para tempo de experiência até 4 anos. \n2 - para tempo de experiência de 4 à 6 anos. \n3 - para tempo de experiência superior a 6 anos");
            tempoExperiencia = leitor.nextInt();

            if(tempoExperiencia == 1)
            {
                pontuacao = pontuacao + 100;
                System.out.println(nomeCandidato + " sua pontuação é de " + pontuacao);
            }
            else if(tempoExperiencia == 2)
            {
                pontuacao = pontuacao + 120;
                System.out.println(nomeCandidato + " sua pontuação é de " + pontuacao);
            }
            else if (tempoExperiencia == 3)
            {
                pontuacao = pontuacao + 150;
                System.out.println(nomeCandidato + " sua pontuação é de " + pontuacao);
            }
        }
        else
        {
            System.out.println("Sua validação não pode ser completada. Por favor, digite uma das opções");
        }

        leitor.close();
    }
}