
/**
 * Livro
 */
public class Livro {

    //atributos do livro : características do livro
    String titulo;
    String editora;
    String autor;
    int numeroPaginas;
    boolean disponivel;

    //métodos do livro: ações ou comportamentos do livro
    public void emprestar(){
        disponivel = false;
    } 

    public void devolver(){ //void significa que o método não tem retorno
        disponivel = true;
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    //criar um método para exibir os dados de um livro

    public void exibirDados(){
        System.out.println("Título:" + titulo + "\nEditora: "+ editora + "\nAutor: "+ autor + "\nNúmero de Páginas: "+ numeroPaginas);
    }
}