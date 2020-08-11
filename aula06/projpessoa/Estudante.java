package projpessoa;

public class Estudante extends Pessoa{
    private int ra;
    private String curso;
    private int anoGraduacao;
    
    public Estudante(String nome, String endereco, String telefone, int ra, String curso, int anoGraduacao){
        super(nome, endereco, telefone);
        this.ra = ra;
        this.curso = curso;
        this.anoGraduacao = anoGraduacao;
    }

    public Estudante(){
        
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoGraduacao() {
        return anoGraduacao;
    }

    public void setAnoGraduacao(int anoGraduacao) {
        this.anoGraduacao = anoGraduacao;
    }

    @Override
    public String exibirDados(){
        return super.exibirDados() + " - " + ra + " - "+ curso + " - "+ anoGraduacao;
    }

    
}