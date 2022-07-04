package laboratorio4;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Horista("Jefferson", "Silva", 150, 15.5));
        funcionarios.add(new Horista("Pedro", "Sampaio", 150, 18));
        funcionarios.add(new Administrador("Antonio", "Nunes", 4210));
        funcionarios.add(new Administrador("Caio", "Castro", 2350));
        funcionarios.add(new Administrador("Ester", "Oliveira", 8900));
        funcionarios.add(new Administrador("Matheus", "Mastergaile", 6500));
        funcionarios.add(new Comissionado("Rodrigo", "Hilbert", 3000, 10, 150000));
        funcionarios.add(new Comissionado("Gabriel", "Barbosa", 1500, 15.5, 26000));
        funcionarios.add(new Comissionado("Gabriel", "Carmo", 1500, 15.5, 35000));
        funcionarios.add(new Gerente("Fabiola", "Adaianne", 8500, 1000));

        funcionarios.forEach(funcionario -> System.out.println(funcionario.toString() + "\n" + funcionario.calcularGanhos()));
    }
}
