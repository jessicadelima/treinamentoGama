package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigo1, numeroPeca1, codigo2, numeroPeca2;
        double vUnitario1, vUnitario2, total;

        codigo1 = entrada.nextInt();
        numeroPeca1 = entrada.nextInt();
        vUnitario1 = entrada.nextDouble();

        codigo2 = entrada.nextInt();
        numeroPeca2 = entrada.nextInt();
        vUnitario2 = entrada.nextDouble();

        entrada.close();

        total = (numeroPeca1*vUnitario1) + (numeroPeca2*vUnitario2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}