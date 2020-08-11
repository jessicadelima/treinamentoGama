import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String senha;

        System.out.println("Digite a senha:");
        senha = entrada.nextLine();

        entrada.close();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido!");
        }
        else {
            System.out.println("Acesso negado! Senha incorreta.");
        }
    }
}