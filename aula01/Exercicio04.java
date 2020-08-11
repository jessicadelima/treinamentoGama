import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float salario;
        int quilowatt;
        float v_quilowatt;
        float v_consumo;

        System.out.println("Digite o valor do salário mínimo:");
        salario = entrada.nextFloat();

        System.out.println("Digite a quantidade de quilowatts consumida:");
        quilowatt = entrada.nextInt();

        entrada.close();

        v_quilowatt = salario*(1/500);
        v_consumo = (float)(quilowatt*v_quilowatt);

        System.out.println("Valor de 1 quilowatt: R$ "+v_quilowatt);
        System.out.println("Valor total do consumo ("+quilowatt+" quilowatts): R$ "+v_consumo);
        System.out.println("Valor a ser pago com desconto de 15%: R$ "+(v_consumo*0.85));





    }
}