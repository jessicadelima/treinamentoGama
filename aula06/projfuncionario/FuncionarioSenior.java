package projfuncionario;

public class FuncionarioSenior extends Funcionario{

    private float bonus;

    public FuncionarioSenior(String nome, int horas, float valorHora, float bonus){
        super(nome, horas, valorHora);
        this.bonus = bonus;
    }

    @Override
    public float calculaSalario(){
        return super.calculaSalario() + ((super.getHorasTrabalhadas()/10)*bonus);
    }

    @Override
    public String toString(){
        return super.toString()+" : "+bonus;
    }
    
}