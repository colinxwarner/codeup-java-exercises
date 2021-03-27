package animals.feline;

public class HouseCat extends Feline {

    private final String kittyAction;
    private final String furColor;

    public HouseCat(String sound, String size, String subSpecies, String commonName, String kittyAction, String furColor) {
        super(size, commonName, subSpecies, sound);
        this.kittyAction = kittyAction;
        this.furColor = furColor;

    }

    public void printKittyAction(){
        System.out.printf("***%s***\n", kittyAction);
    }

    public void printFurColor(){
        System.out.printf("Fur Color: %s\n\n", furColor);
    }

    public void printDelimiter(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void printDetails(){
        makeSound();
        printKittyAction();
        call();
        printDelimiter();
        printSubSpecies();
        printCommonName();
        printFurColor();
        printSize();
        printDelimiter();
    }
}
