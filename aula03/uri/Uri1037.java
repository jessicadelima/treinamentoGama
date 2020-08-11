package uri;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float numero;

        numero = entrada.nextFloat();
        entrada.close();

        if ((numero < 0 ) || (numero > 100)) {
            System.out.println("Fora de intervalo");
        } else {
            if (numero > 75){
                System.out.println("Intervalo (75,100]");
            } else {
                if (numero > 50) {
                    System.out.println("Intervalo (50,75]");
                } else {
                    if (numero > 25) {
                        System.out.println("Intervalo (25,50]");
                    } else {
                        if (numero >= 0) {
                            System.out.println("Intervalo [0,25]");
                        } 
                    }
                }
            }
        }
    }
}