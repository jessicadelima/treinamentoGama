package projpessoa;

public class Professor extends Pessoa {
    
    private String titulo;
    private String instituicao;
    private float salario;

    public Professor(String nome, String endereco, String telefone, String titulo, String instituicao, float salario){
        super(nome, endereco, telefone);
        this.titulo = titulo;
        this.instituicao = instituicao;
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    

}