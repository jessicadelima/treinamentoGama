import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float notas[] = new float [10];
        float soma=0;
        int contador=0;
        
        for (int i=0; i<10; i++){
            System.out.println("Digite a nota do aluno:");
            notas[i] = in.nextFloat();
            soma = soma+notas[i];
        }

        System.out.println("Notas da turma: ");
        for (int i=0; i<10; i++){
            System.out.println("Nota: "+notas[i]);
            if (notas[i]>(soma/10)){
                contador++;
            }
        }

        System.out.println("A média da turma é: "+(soma/10));
        System.out.println(contador+" alunos tiveram notas acima da média da turma.");

        in.close();
        
    }
}