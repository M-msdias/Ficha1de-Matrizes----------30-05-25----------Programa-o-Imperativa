import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        int[][] alunos = new int[5][4];  
        int somaNotasFinais = 0;  
        int maiorNota = -1;  
        int matriculaMaiorNota = -1; 
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Digite a matrícula do aluno: ");
            alunos[i][0] = ler.nextInt(); 
            
            System.out.print("Digite a média das provas: ");
            alunos[i][1] = ler.nextInt(); 
            
            System.out.print("Digite a média dos trabalhos: ");
            alunos[i][2] = ler.nextInt(); 
            
            alunos[i][3] = alunos[i][1] + alunos[i][2];  

            somaNotasFinais += alunos[i][3];
        
            if (alunos[i][3] > maiorNota) {
                maiorNota = alunos[i][3];
                matriculaMaiorNota = alunos[i][0];  
            }
        }
        
        System.out.println("A matrícula do aluno com a maior nota final é: " + matriculaMaiorNota);
        
        double mediaNotasFinais = somaNotasFinais / 5.0;
        System.out.println("A média aritmética das notas finais é: " + mediaNotasFinais);
        
        ler.close();
    }
}
