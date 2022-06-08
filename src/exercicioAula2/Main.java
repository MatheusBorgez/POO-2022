package exercicioAula2;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Engenharia de software", "INF01", 40, 3000);
        Curso curso2 = new Curso("Sistemas de informação", "INF02", 60, 2400);
        Curso curso3 = new Curso("Ciência da computação", "INF03", 60, 3000);
        Curso curso4 = new Curso("Inteligência artificial", "INF04", 40, 3600);

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(curso3.toString());
        System.out.println(curso4.toString());
    }
}
