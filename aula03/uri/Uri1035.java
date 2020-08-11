package uri;

import java.util.Scanner;

public class Uri1035 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a,b,c,d;
        boolean teste;

        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        d = entrada.nextInt();

        entrada.close();

        teste = ((b>c) && (d>a) && ((c+d)>(a+b)) && (c>=0) && (d>=0) && (a%2==0));

        if (teste) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}