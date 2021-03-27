package animals.feline;

public class Lion extends Feline {

    private final boolean isEndangered;
    private final String nativeArea;
    private final boolean isPackAnimal;

    public Lion(String sound, String size, String subSpecies, String commonName, boolean isEndangered, String nativeArea, boolean isPackAnimal) {
        super(size, commonName, subSpecies, sound);
        this.isEndangered = isEndangered;
        this.nativeArea = nativeArea;
        this.isPackAnimal = isPackAnimal;
    }

    public void printDelimiter(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void printEndangeredStatus(){
        System.out.printf("Endangered: %s\n", getStatus(isEndangered));
    }

    public void printNativeArea(){
        System.out.printf("Native Area: %s\n", this.nativeArea);
    }

    public void printPackStatus(){
        System.out.printf("Pack Animal: %s\n", getStatus(isPackAnimal));
    }

    public void printDetails(){
        makeSound();
        call();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printNativeArea();
        printSize();
        printPackStatus();
        printEndangeredStatus();
        printDelimiter();
    }


    private String getStatus(boolean status){
        if (status){
            return "No";
        }else{
            return "Yes";
        }
    }

}
