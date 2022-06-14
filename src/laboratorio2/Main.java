package laboratorio2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("001");
        Produto produto2 = new Produto("002", "Café pilão");
        Produto produto3 = new Produto("003", "Sabão em po OMO", 10);
        Produto produto4 = new Produto("004", "Agua mineral mariza 500ml", 50, 2);

        produto1.inserir("chocolate Kit kat", 15, 5);

        produto1.comprar(10);
        produto1.vender(100);
        produto1.consultar();
        System.out.println(produto1.igual(produto2)); 

        produto2.comprar(200);
        produto2.vender(100);
        produto2.consultar();
        System.out.println(produto2.igual(produto2)); 

        produto3.comprar(5);
        produto3.vender(15);
        produto3.consultar();
        System.out.println(produto3.igual(produto2)); 

        produto4.comprar(0);
        produto4.vender(83);
        produto4.consultar();
        System.out.println(produto4.igual(produto4)); 

    }
}
