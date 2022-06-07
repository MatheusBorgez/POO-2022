package exEster;

public class Peixe extends Animal {

    public Peixe() {
        super(Peixe.class.getSimpleName());
    }

    private void nadar() {
        System.out.println("O "+ getTipoAnimal() + " ESTÁ NADANDO");
    }

    @Override
    public void locomover() {
        nadar();
    }
}
