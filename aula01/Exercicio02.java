import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float nota1;
        float nota2;
        float media;

        System.out.println("Digite a primeira nota:");
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite a segunda nota:");
        nota2 = entrada.nextFloat();

        entrada.close();

        media = (nota1 + nota2) / 2;

        System.out.println("Média entre as notas: " + media);
    }
}