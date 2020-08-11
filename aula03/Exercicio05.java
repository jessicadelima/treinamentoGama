import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero, soma, cont;

        soma = 0;
        numero = 1;
        cont = 1;
        
        while (numero != 0) {
            System.out.print("Digite o "+ cont + "º número: ");
            numero = in.nextInt();
            soma = soma+numero;

            cont++;
        }

        System.out.println("A soma dos valores é: "+soma);
        
        in.close();
    }
}