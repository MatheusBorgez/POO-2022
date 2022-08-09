package laboratorio8.questao2;

public class DepositoIdentificado extends Deposito {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public DepositoIdentificado(String descricao, double valor, String cpf) {
        super(descricao, valor);
        this.cpf = cpf;
    }    
}
