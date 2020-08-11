import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float salario;

        System.out.println("Informe o salário:");
        salario = entrada.nextFloat();

        entrada.close();

        if (salario > 2000) {
            System.out.println("Alíquota IR: 30%");
        }
        else {
            if (salario > 1200) {
                System.out.println("Alíquota IR: 25%");
            }
            else {
                if (salario > 600) {
                    System.out.println("Alíquota IR: 20%");
                }
                else {
                    System.out.println("Alíquota IR: Isento");
                }
            }
        }
    }
}