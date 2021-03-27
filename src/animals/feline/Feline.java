package animals.feline;

import animals.Animal;

public abstract class Feline extends Animal {

    protected final String size;
    protected final String commonName;
    protected final String subSpecies;


    public Feline(String size, String commonName, String subSpecies, String sound){
        super(sound);
        this.size = size;
        this.commonName = commonName;
        this.subSpecies = subSpecies;
    }

    public abstract void printDelimiter();


    public void printSubSpecies(){
        System.out.printf("Sub-Species: %s\n", this.subSpecies);
    }

    public void printCommonName(){
        System.out.printf("Common Name: %s\n", this.commonName);
    }

    public void printSize(){
        System.out.printf("Size: %s\n", this.size);
    }
}
