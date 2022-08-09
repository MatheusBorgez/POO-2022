package laboratorio9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FuncionarioSerializer {

    public FuncionarioSerializer() {    }

    public ArrayList<Funcionario> serializarListaFuncionarios(String path) 
        throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String line = reader.readLine();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while(line != null) {

            String[] campos = line.split("#");
            
            String nome = campos[0];
            char sexo = campos[1].charAt(0);
            double salario = Double.parseDouble(campos[2]);
            int dependentes = Integer.parseInt(campos[3]);

            funcionarios.add(new Funcionario(nome, sexo, salario, dependentes));

            line = reader.readLine();
        }

        return funcionarios;
    }    
}
