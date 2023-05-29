import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno = "";
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<ArrayList<Double>> notas = new ArrayList<>();

        while (!nomeAluno.equalsIgnoreCase("fim")) {
            System.out.print("Digite o nome do aluno (ou 'fim' para sair): ");
            nomeAluno = scanner.nextLine();

            if (!nomeAluno.equalsIgnoreCase("fim")) {
                alunos.add(nomeAluno);
                System.out.println("Aluno: " + nomeAluno);

                ArrayList<Double> grades = new ArrayList<>();

                for (int i = 0; i < 3; i++) {
                    System.out.print("Digite a nota " + (i + 1) + " para " + nomeAluno + ": ");
                    double nota = scanner.nextDouble();
                    grades.add(nota);
                }

                notas.add(grades);
                scanner.nextLine();
            }
        }

        System.out.println("Programa encerrado.");

        System.out.println("Notas dos alunos:");
        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            ArrayList<Double> grades = notas.get(i);

            System.out.println("Aluno: " + aluno);
            System.out.println("Notas:");
            for (int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1) + ": " + grades.get(j));
            }
            System.out.println();
        }
    }
}
