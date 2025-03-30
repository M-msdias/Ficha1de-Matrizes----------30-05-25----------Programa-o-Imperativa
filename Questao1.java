import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int contador = 0; 
        
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sun.launcher.resources.nextInt();
                
    
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }
        
        System.out.println("\nA matriz possui " + contador + " valores maiores que 10.");
        
        ler.close();
    }
}
