import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int numero, pares, impares, cont;

        cont = 1;
        pares = 0;
        impares = 0;

        while (cont<=10) {
            System.out.print("Digite o número "+ cont + ": ");
            numero = in.nextInt();

            if (numero%2 == 0) {
                pares++;
            } else {
                impares++;
            }

            cont++;
        }

        System.out.println("Total de números pares digitados: "+pares);
        System.out.println("Total de números ímpares digitados: "+impares);
        in.close();
    }
}