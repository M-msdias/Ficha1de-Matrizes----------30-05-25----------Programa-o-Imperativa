import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int alunos = ler.nextInt();
        ler.nextLine();

        String[] reprovados = new String[alunos]; 
        int reprovadosCount = 0;

        for (int i = 0; i < alunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = ler.nextLine();

            System.out.print("Digite a presença do aluno (30 dias, P ou F): ");
            String presencas = ler.nextLine();

            int faltas = 0;
            String diasFaltas = "";

            for (int j = 0; j < presencas.length(); j++) {
                if (presencas.charAt(j) == 'F') {
                    faltas++;
                    diasFaltas += (j + 1) + " ";
                }
            }
            if (faltas > 10) {
                reprovados[reprovadosCount] = nome + " - Dias: " + diasFaltas;
                reprovadosCount++;
            }
        }
        if (reprovadosCount > 0) {
            System.out.println("Alunos reprovados por falta:");
            for (int i = 0; i < reprovadosCount; i++) {
                System.out.println(reprovados[i]);
            }
        } else {
            System.out.println("Nenhum aluno foi reprovado por falta.");
        }

        ler.close();
    }
}
