import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);

        float numero, soma; 
        int positivo;

        soma = 0;
        positivo = 0;

        for (int i=1; i<=10; i++){
            System.out.print("Digite um número: ");
            numero = in.nextInt();
            soma = soma+numero;

            if (numero > 0) {
                positivo++;
            }
        }

        in.close();
        System.out.println("Soma dos números digitados: "+soma);
        System.out.println("Quantidade de números positivos: "+positivo);
        System.out.println("Média dos números digitados: "+(soma/10));
        System.out.println("Porcentagem de números positivos: "+(positivo*10)+"%");

    }
}