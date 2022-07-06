package laboratorio5;

public class Dependente extends Socio {

    private int tipo;

    public Dependente(String nome, int idade, char sexo, int tipo) {
        super(nome, idade, sexo);
        this.tipo = tipo;
    }

    public Dependente(int tipo) {
        this.tipo = tipo;
    }

    public Dependente() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularValorMensalidade() {
        int idade = super.getIdade();

        if (tipo == 1 || tipo == 2) {
            if (idade <= 10) {
                return 100;
            }
            else if (idade <= 21) {
                return 150;
            }
            else if (idade <= 65) {
                return 200;
            }
            else {
                return 80;
            }
        }

        return idade <= 65 ? 250 : 150;
    }

    @Override
    public String toString() {
        return "Dependente [tipo=" + tipo + "]" + super.toString();
    }
    
}
