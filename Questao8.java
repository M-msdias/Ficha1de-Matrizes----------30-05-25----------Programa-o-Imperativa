import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizTriangular = new int[4][4];
        
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        System.out.println("\nMatriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i <= j) {
                    matrizTriangular[i][j] = matriz[i][j]; 
                } else {
                    matrizTriangular[i][j] = 0; 
                }
            }
        }
        System.out.println("\nMatriz triangular inferior:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizTriangular[i][j] + "\t");
            }
            System.out.println();
        }
       ler.close();
    }
}
