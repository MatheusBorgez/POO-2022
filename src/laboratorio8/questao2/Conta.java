package laboratorio8.questao2;

import java.util.ArrayList;

public class Conta {
    private String nome;
    private int mes;
    private double saldo;
    private ArrayList<Deposito> depositos = new ArrayList<>();
    private ArrayList<Saque> saques = new ArrayList<>();

    public Conta(String nome, int mes, double saldo) {
        this.nome = nome;
        this.mes = mes;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getMes() {
        return mes;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Deposito> getDepositos() {
        return depositos;
    }  
    
    public void adicionaDeposito(String descricao, double valor) {
        depositos.add(new Deposito(descricao, valor));
    }    

    public void adicionaDeposito(String descricao, double valor, String cpf) {
        depositos.add(new DepositoIdentificado(descricao, valor, cpf));
    }    

    public ArrayList<Saque> getSaques() {
        return saques;
    }  
    
    public boolean adicionaSaque(int dia, String descricao, double valor) {
        if (valor >= saldo) {
            saques.add(new Saque(descricao, valor, dia));
            return true;
        }

        return false;
    }   

    public double saldoRestante() {
        double saldoRestante = saldo;

        for (Deposito deposito : depositos) {
            saldoRestante += deposito.getValor();
        }

        for (Saque saque : saques) {
            saldoRestante -= saque.getValor();
        }

        return saldoRestante;
    }

    @Override
    public String toString() {
        return "Conta [depositos=" + depositos + ", mes=" + mes + ", nome=" + nome + ", saldo=" + saldoRestante() + ", saques="
                + saques + "]";
    }
}
