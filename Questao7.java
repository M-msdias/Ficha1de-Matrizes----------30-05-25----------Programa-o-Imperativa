import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        int somaAcimaDiagonal = 0;
        int somaAbaixoDiagonal = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
           
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
                if (i < j) {
                    somaAcimaDiagonal += matriz[i][j];
                }
                if (i > j) {
                    somaAbaixoDiagonal += matriz[i][j];
                }
                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos acima da diagonal principal: " + somaAcimaDiagonal + ".");
        System.out.println("Soma dos elementos abaixo da diagonal principal: " + somaAbaixoDiagonal+ ".");
        System.out.println("Soma dos elementos na diagonal principal: " + somaDiagonalPrincipal+ ".");
        System.out.println("Soma dos elementos na diagonal secundária: " + somaDiagonalSecundaria+ ".");
        
        ler.close();
    }
}
