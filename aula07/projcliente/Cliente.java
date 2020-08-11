package projcliente;

public class Cliente {
    
    private String nome, email;
    private float credito;
    private Dependente dependente;

    public Cliente(String nome, String email, String nomed, String emaild){
        this.nome = nome;
        this.email = email;
        this.credito = 0;
        this.dependente = new Dependente(nomed, emaild);
    }

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.credito = 0;
        this.dependente = new Dependente("", "");
    }

    @Override
    public String toString(){
        return nome+" : "+email+" : "+credito+" : "+dependente.toString();
    }

    public boolean fazerCompra(float valor){
        if ((valor > 0)&&(valor <= credito)){
            credito = credito-valor;
            return true;
        } 
        return false;
    }

    public boolean colocarCredito(float valor){
        if (valor > 0) {
            credito = credito + valor;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCredito() {
        return credito;
    }

    protected void setCredito(float credito) {
            this.credito = credito;
    }

    

}