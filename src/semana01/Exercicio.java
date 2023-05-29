import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno = "";
        String[] alunos = new String[100];

        int index = 0;

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome do aluno (ou 'fim' para sair): ");
            nomeAluno = scanner.nextLine();

            if (!nomeAluno.equalsIgnoreCase("fim")) {
                alunos[index] = nomeAluno;
                index++;
                System.out.println("Aluno: " + nomeAluno);
            }
        }

        System.out.println("Programa encerrado.");


        System.out.println("Lista de alunos:");
        for (int i = 0; i < index; i++) {
            System.out.println(alunos[i]);
        }
    }
}
