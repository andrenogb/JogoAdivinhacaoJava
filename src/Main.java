import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        int jogarNovamente;

        do {

            int numeroSecreto = gerador.nextInt(101);
            int tentativas = 5;
            boolean acertou = false;
            int numeroTentativas = 1;

            System.out.println("""
                    Bem vindo ao jogo da adivinhacao!
                    Voce tem 5 tentativas pra tentar acertar o numero de 0 a 100!
                    Boa sorte!!!
                    """);


            for (int i = 0; i < tentativas; i++) {

                System.out.println("Tentativa numero " + numeroTentativas++);
                int chute = leitor.nextInt();

                if (chute == numeroSecreto) {
                    acertou = true;
                    System.out.println("Parabens voce acertou bem na mosca!");
                    break;
                }
                if (i < tentativas - 1) {
                    if (chute < numeroSecreto) {
                        System.out.println("Errou o seu chute é MENOR que o numero secreto...");
                    } else {
                        System.out.println("Errou o seu chute é MAIOR que o numero secreto...");
                    }
                    System.out.println("Tente novamente...");
                } else {
                    System.out.println("Infelizmente voce nao acertou o numero correto era: " + numeroSecreto);
                    break;
                }

            }


            System.out.println("Deseja jogar novamente? (1- Sim ou 2- Nao)");
            jogarNovamente = leitor.nextInt();

        } while (jogarNovamente == 1);

        System.out.println("Até a proxima!");

        leitor.close();

    }
}

