package exercicioAula3;

public class TestaHeranca {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSalario(5000);
        System.out.println("A bonificação é de: " + gerente.bonificacao());

        Vendedor vendedor = new Vendedor(10000, "Negrão de Lima");

        System.out.println("A meta do vendedor é de: R$" + vendedor.getMeta() + " e sua região é " + vendedor.getRegiao());

    }
}
