public class Sample04 {
    
    public static void main(String[] args) {
        //conversão de tipo de dados

        int numerointeiro;
        float numerofloat;

        numerointeiro = 230;

        //armazenar um tipo menor em um maior sem problema
        numerofloat = numerointeiro;

        //armazenar um tipo maior em um tipo menor não funciona
        //numerointeiro = numerofloat;

        numerofloat = 7.99999f; //f para dizer que é float
        //casting: força uma conversão de tipo com possível perda de precisão
        //não tem arredondamento
        numerointeiro = (int)numerofloat;

        System.out.println(numerointeiro);
        System.out.println(numerofloat);
    }

}