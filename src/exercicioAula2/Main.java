package exercicioAula2;

public class Main {
    public static void main(String[] args) {

        Departamento departamento = new Departamento("Instituto de Informática", "INF", 01);

        Curso curso1 = new Curso("Engenharia de software", "INF01", 40, 3000, departamento);
        Curso curso2 = new Curso("Sistemas de informação", "INF02", 60, 2400, departamento);
        Curso curso3 = new Curso("Ciência da computação", "INF03", 60, 3000, departamento);
        Curso curso4 = new Curso("Inteligência artificial", "INF04", 40, 3600, departamento);

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(curso3.toString());
        System.out.println(curso4.toString());
    }
}
