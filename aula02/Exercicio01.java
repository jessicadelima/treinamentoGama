import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;
        float metade;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        entrada.close();

        if (numero>20) {
            metade = (float)(numero/2);
            System.out.printf("Metade = %.2f \n",metade);
        }
    }
}