import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1, numero2;

        System.out.println("Digite um número:");
        numero1 = entrada.nextFloat();
        System.out.println("Digite um número:");
        numero2 = entrada.nextFloat();

        entrada.close();

        if (numero1 > numero2){
            System.out.println(numero1+"\n"+numero2);
        }
        else{
            System.out.println(numero2+"\n"+numero1);
        }
    }
}