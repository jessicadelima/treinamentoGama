/**
 * Sample02
 */
public class Sample02 {

    public static void main(String[] args) {
        int numero = 10;
        boolean teste; //true, false

    System.out.println(numero);;
    System.out.println(numero + 10);
    System.out.println(numero >= 10);

    teste = (numero > 10) || (numero == 10);
    System.out.println(teste);

    if (teste) {
        System.out.println("Passou no teste");
    } else {
        System.out.println("Não passou no teste");
    }
    }
}