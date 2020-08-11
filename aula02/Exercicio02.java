import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, media;

        System.out.println("Digite a Nota 1:");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a Nota 2:");
        nota2 = entrada.nextFloat();

        entrada.close();

        media = (nota1*0.4f)+(nota2*0.6f);

        if (media>=6) {
            System.out.println("O aluno foi aprovado. Média: "+media);
        }
        else {
            System.out.println("O aluno foi reprovado. Média: "+media);
        }
        
    }
}