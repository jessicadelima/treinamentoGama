package uri;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double a,b,c,media;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        entrada.close();

        media = ((a*0.2)+(b*0.3)+(c*0.5));

        System.out.printf("MEDIA = %.1f\n",media);

    }
}