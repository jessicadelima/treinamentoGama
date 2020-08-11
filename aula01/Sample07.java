import java.util.Scanner;

public class Sample07 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String entradaDigitada;
        String nome;
        int idade;
        float peso;

        //pegar toda a entrada como texto e converter depois para as variáveis
        //para não ter problema de perder dados no cache

        System.out.println("Digite o seu nome:");
        entradaDigitada = entrada.nextLine();
        nome = entradaDigitada;

        System.out.println("Digite a sua idade:");
        entradaDigitada = entrada.nextLine();
        idade = Integer.parseInt(entradaDigitada);

        System.out.println("Digite o seu peso:");
        entradaDigitada = entrada.nextLine();
        peso = Float.parseFloat(entradaDigitada);

        System.out.println("Olá "+nome+"!");
        System.out.println("Você tem "+idade+" anos.");
        System.out.println("Você tem "+peso+" Kg.");

        entrada.close();
    }
}