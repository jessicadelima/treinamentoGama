import java.util.Scanner;
import java.util.Stack;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada;
        Stack<Character> texto = new Stack<>();

        System.out.println("Digite um texto:");
        entrada = in.nextLine();

        char fraseVetor[] = entrada.toCharArray();
       
        for (char letra : fraseVetor) { //para cada caracter 'letra' do vetor
            texto.push(letra);
        }

        while(!texto.isEmpty()){
            System.out.println(texto.pop());
        }    

        in.close();
    }
}