import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media1, exame, media2;
        int falta;

        System.out.println("Digite a quantidade de faltas do aluno:");
        falta = entrada.nextInt();

        if (falta < 16) {
            System.out.println("Digite as 4 notas do aluno:");
            nota1 = entrada.nextFloat();
            nota2 = entrada.nextFloat();
            nota3 = entrada.nextFloat();
            nota4 = entrada.nextFloat();

            media1 = (nota1+nota2+nota3+nota4)/4;

            if (media1 >= 6) {
                System.out.println("Aluno aprovado!");
            }
            else {
                System.out.println("Aluno com média menor ou igual 6. \nDigite a nota do exame:");
                exame = entrada.nextFloat();

                media2 = (media1 + exame)/2;

                if (media2 >= 5) {
                    System.out.println("Aluno aprovado em exame! Média final: "+media2);
                }
                else {
                    System.out.println("Aluno reprovado por nota. Média final: "+media1);
                }
            }
        }
        else {
            System.out.println("Aluno reprovado por falta. Total de faltas: "+falta);
        }

        entrada.close();

    }
}