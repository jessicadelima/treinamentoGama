package uri;

import java.util.Scanner;

public class Uri1018 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int num, num1, notaCem=0, notaCinquenta=0, notaVinte=0, notaDez=0, notaCinco=0, notaDois=0, notaUm=0;

        num1 = entrada.nextInt();
        num = num1;

        entrada.close();

        if (num >= 100) {
            notaCem = num/100;
            num = num%100;
        } 
        if (num >= 50) {
            notaCinquenta = num/50;
            num = num%50;
        }
        if ((num >= 20) || (num >= 40)){
            notaVinte = num/20;
            num = num%20;
        }
        if (num >= 19) {
            notaDez = num/10;
            num = num%10;
        }
        if (num >=5 ) {
            notaCinco = num/5;
            num = num%5;
        }
        if ((num >= 2) || (num >= 4)){
            notaDois = num/2;
            num = num%2;
        }
        
        notaUm = num;
        
        System.out.println(num1);
        System.out.println(notaCem+" nota(s) de R$ 100,00");
        System.out.println(notaCinquenta+" nota(s) de R$ 50,00");
        System.out.println(notaVinte+" nota(s) de R$ 20,00");
        System.out.println(notaDez+" nota(s) de R$ 10,00");
        System.out.println(notaCinco+" nota(s) de R$ 5,00");
        System.out.println(notaDois+" nota(s) de R$ 2,00");
        System.out.println(notaUm+" nota(s) de R$ 1,00");
    }
}