package projcliente;

public class ClienteVIP extends Cliente{
    
    private float creditoEspecial;

    public ClienteVIP(String nome, String email, String nomed, String emaild, float creditoEspecial){
        super(nome, email, nomed, emaild);
        setCreditoEspecial(creditoEspecial);
    }

    public ClienteVIP(String nome, String email, String nomed){
        super(nome, email);
        setCreditoEspecial(creditoEspecial);
    }

    @Override
    public String toString(){
        return super.toString()+" : "+creditoEspecial;
    }

    @Override
    public boolean fazerCompra(float valor){
        if ((valor >0) && (valor <= (getCredito()+creditoEspecial))){
            setCredito(getCredito()-valor);
            return true;
        }
        return false;
    }

    public float getCreditoEspecial() {
        return creditoEspecial;
    }

    public void setCreditoEspecial(float creditoEspecial) {
        if (creditoEspecial > 0) {
            this.creditoEspecial = creditoEspecial;
        }
        
    }

    

}