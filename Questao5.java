import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        System.out.println("Digite os valores para a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }
        System.out.print("Digite o valor X para busca: ");
        int X = ler.nextInt();
        
        boolean encontrado = false;
        int linha = -1;
        int coluna = -1;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == X) {
                    linha = i;
                    coluna = j;
                    encontrado = true;
                    break;  
                }
            }
            if (encontrado) {
                break;  
            }
        }
        if (encontrado) {
            System.out.println("Valor " + X + " encontrado na posição: Linha " + linha + ", Coluna " + coluna + ".");
        } else {
            System.out.println("Valor " + X + " não encontrado na matriz.");
        }
        
        ler.close();
    }
}
