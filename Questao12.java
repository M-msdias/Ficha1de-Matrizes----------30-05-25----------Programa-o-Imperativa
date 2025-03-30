import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[][] matriz1 = new double[2][2];
        double[][] matriz2 = new double[2][2];
        double[][] resultado = new double[3][3];

        System.out.println("Digite os valores da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz 1[" + (i+1) + "][" + (j+1) + "]: ");
                matriz1[i][j] = ler.nextDouble();
            }
        }

        System.out.println("Digite os valores da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Matriz 2[" + (i+1) + "][" + (j+1) + "]: ");
                matriz2[i][j] = ler.nextDouble();
            }
        }

        int opcao = -1;
        while (opcao != 5) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Somar as duas matrizes");
            System.out.println("2. Subtrair a primeira matriz da segunda");
            System.out.println("3. Adicionar uma constante às duas matrizes");
            System.out.println("4. Imprimir as matrizes");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }
                System.out.println("Resultado da soma das duas matrizes:");
                imprimirMatriz(resultado);
            } else if (opcao == 2) {
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        resultado[i][j] = matriz2[i][j] - matriz1[i][j];
                    }
                }
                System.out.println("Resultado da subtração (Matriz 2 - Matriz 1):");
                imprimirMatriz(resultado);
            } else if (opcao == 3) {
                System.out.print("Digite o valor da constante: ");
                double constante = ler.nextDouble();

                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matriz1[i][j] += constante;
                        matriz2[i][j] += constante;
                    }
                }
                System.out.println("As duas matrizes foram modificadas com a adição da constante.");
            } else if (opcao == 4) {
                System.out.println("Matriz 1:");
                imprimirMatriz(matriz1);
                System.out.println("Matriz 2:");
                imprimirMatriz(matriz2);
            } else if (opcao == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        ler.close();
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
