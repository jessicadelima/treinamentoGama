import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int cont, numero;
        cont = 0;

        System.out.println("Digite um número:");
        numero = in.nextInt();

        in.close();

        System.out.println("Tabuada do número "+numero);

        while (cont <= 10){
            System.out.println(numero+" x "+cont+" = "+(numero*cont));
            cont++;
        }
    }
}