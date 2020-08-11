import java.util.Scanner;

public class AppEbook {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int pagina;

        pagina = in.nextInt();

        Ebook ebook = new Ebook("teste","teste",50,1);

        ebook.avancarPagina();
        ebook.avancarPagina();
        ebook.avancarPagina();
        ebook.avancarPagina();
        ebook.avancarPagina();
        System.out.println(ebook.exibirPagina());
        ebook.retrocederPagina();
        ebook.retrocederPagina();
        System.out.println(ebook.exibirPagina());
        System.out.println(ebook.mostrarCapa());
        System.out.println(ebook.exibirPagina());
        ebook.irParaPagina(pagina);
        System.out.println(ebook.exibirPagina());

    }
}