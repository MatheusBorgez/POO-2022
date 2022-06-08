package exercicioAula2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Curso> cursos = new ArrayList<>();



        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("digite o nome do curso");
            String nome = sc.nextLine();

            System.out.println("digite o codigo do curso");
            String codigo = sc.nextLine();

            System.out.println("digite a quantidade de vagas do curso");
            int vagas = sc.nextInt();

            System.out.println("digite a carga horaria do curso");
            int cargaHoraria = sc.nextInt();
         
            sc.close();
               
            cursos.add(new Curso(nome, codigo, vagas, cargaHoraria));
        }

        cursos.forEach(curso -> curso.toString());
    }
}
