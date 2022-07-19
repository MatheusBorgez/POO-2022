package laboratorio5;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Titular> titulares = new ArrayList<>();

        int qtdSocios = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos socios titulares serão cadastrados"));

        String nome = "";
        int idade = 0;
        char sexo = ' ';
        int numTitulo = 0;

        for (int i = 0 ; i < qtdSocios ; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome do sócio titular");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do sócio titular"));
            sexo = JOptionPane.showInputDialog("Digite o sexo do socio titular").charAt(0);
            numTitulo = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do titulo"));

            titulares.add(new Titular(nome, idade, sexo, numTitulo));
        }

        int tipoDependente = 0;

        for (Titular titular : titulares) {
            qtdSocios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes que serão cadastrados para o sócio " + titular.getNome()));

            for (int i = 0; i < qtdSocios; i++) {                
                nome = JOptionPane.showInputDialog("Digite o nome do dependente");
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do dependente"));
                sexo = JOptionPane.showInputDialog("Digite o sexo do dependente").charAt(0);
                tipoDependente = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo"));
                
                titular.associarObjetos(new Dependente());
            }
        }

        for (Titular titular : titulares) {
            JOptionPane.showMessageDialog(null, "Valor da mensalidade para o sócio " + titular.getNome() + "\n" + titular.calcularValorMensalidade());
        }

    }
}
