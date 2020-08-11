package projpessoa;

public class AppEscola {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("Jessica", "teste", "xxxx-xxxx", 123456, "teste", 2016);

        System.out.println("Estudante: "+estudante.getNome());
        
    }
}