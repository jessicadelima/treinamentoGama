import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite o salário do funcionário:");
        salario = entrada.nextFloat();

        entrada.close();

        salario = (salario*1.25);

        System.out.println("O salário reajustado é: R$ "+salario);

    }
}