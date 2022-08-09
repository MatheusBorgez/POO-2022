package laboratorio9;

import java.util.ArrayList;

import org.junit.Test;


public class Teste {

    public final String path = "C:\\Users\\Matheus Borges\\Desktop\\FACUL\\POO-2022\\src\\laboratorio9\\funcionarios.txt";

    public static void main(String[] args) throws Exception {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            //funcionarios = new FuncionarioSerializer().serializarListaFuncionarios("funcioanrios.txt");
        } catch (Exception e) {
            throw e;
        }        
    }

    @Test
    public void testeSerializar() throws Exception {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            funcionarios = new FuncionarioSerializer().serializarListaFuncionarios(path);
        } catch (Exception e) {
            throw e;
        }   
    }
}
