import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 4x4 digitada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  
        }
        int maiorValor = matriz[0][0];  
        int linhaMaior = 0;
        int colunaMaior = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("\nO maior valor é " + maiorValor + ".");
        System.out.println("Sua localização é: Linha " + linhaMaior + ", Coluna " + colunaMaior + ".");
       
        ler.close();
    }
}
