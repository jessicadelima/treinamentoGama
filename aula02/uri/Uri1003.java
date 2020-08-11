package uri;

import java.util.Scanner;

/**
 * Uri1003
 */
public class Uri1003 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        entrada.close();

        soma = a + b;

        System.out.println("SOMA = "+soma);

    }
}