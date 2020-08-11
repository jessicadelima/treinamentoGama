import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite 3 números:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        entrada.close();

        if ((a>(b+c)) || (b>(a+c)) || (c>(a+b))){
            System.out.println("Não é um triângulo!");
        }
        else {
            if ((a==b) && (b==c)){
                System.out.println("É um triângulo equilátero!");
            }
            else{
                if ((a==b) || (b==c) || (c==a)) {
                    System.out.println("É um triângulo isósceles!");;
                }
                else {
                    System.out.println("É um triângulo escaleno!");
                }
            }
        }
    }
}