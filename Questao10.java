import java.util.Arrays;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];  
        int[] vetorSoma = new int[3];    
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = ler.nextInt();
                vetorSoma[j] += matriz[i][j];  
            }
        }
        System.out.println("Vetor soma das colunas: " + Arrays.toString(vetorSoma));

        ler.close();
    }
}
