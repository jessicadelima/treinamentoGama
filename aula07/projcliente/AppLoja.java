package projcliente;

public class AppLoja {
    public static void main(String[] args) {
        
        Cliente c = new Cliente("Carlos","calos@carlos.com.br","filho1","filho1@filho.com.br");
        ClienteVIP cVip = new ClienteVIP("Marcos", "marcos@marcos.com.br", "filho1", "filho1@filho.com.br", 100);


        c.colocarCredito(100);

        if (c.fazerCompra(100)){
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Não foi possível efetuar a compra!");
        }

        //cVip.colocarCredito(100);

        if (cVip.fazerCompra(100)){
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Não foi possível efetuar a compra!");
        }

        System.out.println(c);
        System.out.println(cVip);
        
    }
}