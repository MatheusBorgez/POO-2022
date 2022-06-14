package laboratorio2;

public class Produto {

    private String codigoSequencial;
    private String nomeProduto;
    private int quantidadeProduto;
    private double valorProduto;
    
    public Produto(String codigoSequencial) {
        this.codigoSequencial = codigoSequencial;        
    }
    
    public Produto(String codigoSequencial, String nomeProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = 0;
        this.valorProduto = 1.99;
    }
    
    public Produto(String codigoSequencial, String nomeProduto, int quantidadeProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto(String codigoSequencial, String nomeProduto, int quantidadeProduto, float valorProduto) {
        this.codigoSequencial = codigoSequencial;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorProduto = valorProduto;
    }

    public String getCodigoSequencial() {
        return codigoSequencial;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getquantidadeProduto() {
        return quantidadeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void vender (int quantidade) {

        if (quantidade > this.quantidadeProduto) {
            System.out.println("Quantidade indisponível");
            return;
        }

        this.quantidadeProduto -= quantidade;
        System.out.println("Valor total da venda:" + this.valorProduto * quantidade);
    }

    public void comprar (int quantidade, float novoValor) {
        this.quantidadeProduto += quantidade;
        this.valorProduto = novoValor;
    }

    public void comprar (int quantidade) {
        this.quantidadeProduto += quantidade;
    }

    public String consultar() {
        return toString();
    }

    @Override
    public String toString() {
        return "Produto [codigoSequencial=" + codigoSequencial + ", nomeProduto=" + nomeProduto + ", quantidadeProduto="
                + quantidadeProduto + ", valorProduto=" + valorProduto + "]";
    }

    public void inserir (String nomeProduto, int quantidade, float valorProduto) {

        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidade;
        this.valorProduto = valorProduto;
    }

    public boolean igual(Produto produto) {
        return this.nomeProduto.equals(produto.nomeProduto);
    }
    
}
