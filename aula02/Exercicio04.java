import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double salario,prestacao;

        System.out.println("Digite o valor do salário bruto:");;
        salario = entrada.nextDouble();
        System.out.println("Digite o valor da prestação:");;
        prestacao = entrada.nextDouble();

        entrada.close();

        if (prestacao > (salario*0.3)){
            System.out.println("O empréstimo não pode ser concedido!");
        }
        else {
            System.out.println("O empréstimo pode ser concedido!");
        }
    }
}