import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] teatro = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = -1;
            }
        }
        System.out.print("Digite o número de compras: ");
        int N = ler.nextInt(); 

        for (int i = 0; i < N; i++) {
            System.out.print("Digite a linha e a coluna do assento (0-9): ");
            int linha = ler.nextInt();
            int coluna = ler.nextInt();

            if (teatro[linha][coluna] == -1) {
                teatro[linha][coluna] = 1; 
            } else {
                System.out.println("Poltrona já foi vendida. Escolha outro assento.");
                i--;
            }
        }
        System.out.println("Mapa de assentos do teatro:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (teatro[i][j] == -1) {
                    System.out.print("L "); 
                } else {
                    System.out.print("X "); 
                }
            }
            System.out.println();
        }
        ler.close();
    }
}
