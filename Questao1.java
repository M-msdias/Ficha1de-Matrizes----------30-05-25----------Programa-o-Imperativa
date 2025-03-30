import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int contador = 0; 
        
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = ler.nextInt();

                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.println("\nMatriz inserida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("A matriz possui " + contador + " valores maiores que 10.");
        
        ler.close();
    }
}
