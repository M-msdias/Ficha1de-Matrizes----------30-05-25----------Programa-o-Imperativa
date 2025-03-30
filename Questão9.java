public class Questao9 {
    public static void main(String[] args) {
        
        int[][] cartela = new int[5][5];
        int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i; 
        }
        for (int i = 0; i < 100; i++) {
            int j = (int) (Math.random() * (100 - i)) + i;  
            int temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }
        int index = 0;  
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = numeros[index];
                index++;
            }
        }
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println(); 
        }
    }
}
