import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, cont;

        System.out.println("Digite um número: ");
        num = in.nextInt();

        in.close();

        cont = 1;

        while (cont <= num) {
            System.out.print(cont+ " ");
            cont = cont*2;
        }
    }
}