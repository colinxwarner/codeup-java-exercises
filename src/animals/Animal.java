package animals;

public abstract class Animal implements Describable, Callable{

    protected final String sound;

    public Animal(String sound){
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("\n" + sound + "\n");
    }

    public void call(){
        System.out.println("**Whistles** \n Come here you gud boi!");
    }

    public abstract void printDelimiter();

    public abstract void printSubSpecies();

    public abstract void printCommonName();

    public abstract void printSize();
}
