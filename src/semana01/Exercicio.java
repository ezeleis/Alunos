import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno = "";
        ArrayList<String> alunos = new ArrayList<>();

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome do aluno (ou 'fim' para sair): ");
            nomeAluno = scanner.nextLine();

            if (!nomeAluno.equalsIgnoreCase("fim")) {
                alunos.add(nomeAluno);
                System.out.println("Aluno: " + nomeAluno);
            }
        }

        System.out.println("Programa encerrado.");


        double[][] notas = new double[alunos.size()][3];


        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);

            for (int j = 0; j < 3; j++) {
                System.out.print("Digite a nota " + (j + 1) + " para " + aluno + ": ");
                notas[i][j] = scanner.nextDouble();
            }

            scanner.nextLine();
        }

        System.out.println("Notas dos alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            double[] grades = notas[i];

            System.out.println("Aluno: " + aluno);
            System.out.println("Notas:");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1) + ": " + grades[j]);
            }
            System.out.println();
        }
    }
}
