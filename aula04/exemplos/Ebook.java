public class Ebook {
    //atributos do livro : características do livro
    String titulo;
    String autor;
    int totalPaginas;
    int paginaAtual;
    
    //método construtor: iniciliza os atributos do objeto
    //ele tem o mesmo nome da classe
    public Ebook(String titulo,String autor, int totalPaginas, int paginaAtual){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        
    }

    //métodos do livro: ações ou comportamentos do livro
    public void avancarPagina(){
        paginaAtual++;
    } 

    public void retrocederPagina(){ 
        paginaAtual--;
    }

    public void irParaPagina(int pagina){
        paginaAtual = pagina;
    }

    public int exibirPagina(){
        return paginaAtual;        
    }

    public int mostrarCapa(){
        return paginaAtual = 1;
    }

    
}