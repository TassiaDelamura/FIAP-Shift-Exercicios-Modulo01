import java.util.Scanner;

public class ExercicioBonus4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        String funcionarioNome, setor;
        int transporte, placaDigito, colaboradores;

        System.out.println("Por favor, digite o número de colaboradores:");
        colaboradores = leitor.nextInt();

        for(int i = 0; i < colaboradores; i++)
        {
            System.out.println("Por favor, digite seu nome");
            funcionarioNome = leitor.next();

            System.out.println("Por favor, digite seu setor");
            setor = leitor.next();

            System.out.println(funcionarioNome + "por favor, digite o meio de transporte usado: \n1- para ônibus \n2- para carro");
            transporte = leitor.nextInt();

            if(transporte == 1){
                System.out.println("O rodízio não se aplica");
            }
            else if (transporte == 2)
            {
                System.out.println(funcionarioNome + "Digite o último dígito numérico da placa do carro: ");
                placaDigito = leitor.nextInt();

                if(placaDigito == 1 || placaDigito == 2)
                {
                    System.out.println("Seu dia de rodízio é: segunda-feira");
                }
                else if (placaDigito == 3 || placaDigito == 4)
                {
                    System.out.println("Seu dia de rodízio é: terça-feira");
                }
                else if (placaDigito == 5 || placaDigito == 6)
                {
                    System.out.println("Seu dia de rodízio é: quarta-feira");
                }
                else if (placaDigito == 7 || placaDigito == 8)
                {
                    System.out.println("Seu dia de rodízio é: quinta-feira");
                }
                else if ( placaDigito == 9 || placaDigito == 0)
                {
                    System.out.println("Seu dia de rodízio é: sexta-feira");
                }
                else 
                {
                    System.out.println(funcionarioNome + "por favor, digite o último dígito numérico da placa");
                }
            }

        }
        leitor.close();

    }
}
