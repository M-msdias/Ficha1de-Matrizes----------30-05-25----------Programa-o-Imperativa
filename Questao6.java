public class Questao6 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;  
                } 
                else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1; 
                }
                 else {
                }
            }
        }
        System.out.println("Matriz 10x10 gerada:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");  
            }
            System.out.println(); 
        }
    }
}
