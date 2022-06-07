package exEster;

public class Onca extends Animal {

    public Onca() {
        super(Onca.class.getSimpleName());
    }

    private void andar() {
        System.out.println("A " + getTipoAnimal() + " ESTÁ ANDANDO");
    }

    @Override
    public void locomover() {
        andar();
    }
}
