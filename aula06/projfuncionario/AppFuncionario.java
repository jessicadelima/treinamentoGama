package projfuncionario;

public class AppFuncionario {
   public static void main(String[] args) {
       
    Funcionario f1 = new Funcionario("teste", 200, 18.50f);

    System.out.println(f1);
    System.out.println("Salario: "+f1.calculaSalario());

    FuncionarioSenior f2 = new FuncionarioSenior("teste", 200, 18.50f,10);

    System.out.println(f2);
    System.out.println("Salario: "+f2.calculaSalario());
    


   } 
}