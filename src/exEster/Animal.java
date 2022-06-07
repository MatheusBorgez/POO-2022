package exEster;

public abstract class Animal {

    public String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public abstract void locomover();

    public String getTipoAnimal() {
        return this.tipoAnimal;
    }
}
