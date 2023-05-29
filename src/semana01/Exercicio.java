import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno = "";

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome do aluno (ou 'fim' para sair): ");
            nomeAluno = scanner.nextLine();

            if (!nomeAluno.equalsIgnoreCase("fim")) {
                System.out.println("Aluno: " + nomeAluno);
            }
        }

        System.out.println("Programa encerrado.");
    }
}
