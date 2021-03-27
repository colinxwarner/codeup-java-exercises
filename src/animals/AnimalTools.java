package animals;

import animals.canine.Canine;
import animals.canine.Dog;
import animals.canine.Wolf;
import animals.feline.Feline;
import animals.feline.HouseCat;
import animals.feline.Lion;

import java.util.Scanner;

public class AnimalTools {

    private static final Scanner scanner = new Scanner(System.in);

    public static void initializeAnimalSearch(){

        System.out.println("Would you like to know about canines or felines? (canine/feline) ");

        String input = scanner.nextLine().toLowerCase();

        boolean searchAgain = true;
        try{
            Animal animal = getAnimal(input);

            animal.printDetails();

            System.out.println("Would you like more details on an animal? (yes/y)");

            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")){
                searchAgain = false;
            }

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            if (searchAgain){
                initializeAnimalSearch();
            }
        }
    }

    public static Animal getAnimal(String input) throws IllegalArgumentException{
        Animal animal;

        if (input.equals("canine")){
            animal = getCanine();
        }else if (input.equals("feline")){
            animal = getFeline();
        }else{
            throw new IllegalArgumentException("The input you entered was not valid");
        }
        return animal;
    }

    public static Feline getFeline() throws IllegalArgumentException{
        Feline feline;
        System.out.println("Would you like info on a house cat or lion? (cat/lion)");
        String input2 = scanner.nextLine().toLowerCase();

        try{
            if (input2.equals("cat")){
                feline = new HouseCat("Meeeeooooow", "Small", "Felis Catus",
                        "Tabby", "***Knocks Over Plant***", "Orange and Cream");
            }else if (input2.equals("lion")){
                feline = new Lion("ROOOOOAAAAAARRRRlll!", "Extra Large", "Panthera Leo",
                        "Lion", true, "Sub Saharan Africa", true);
            }else{
                throw new IllegalArgumentException("The input you entered was invalid");
            }
            return feline;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getFeline();
        }
    }

    public static Canine getCanine(){
        Canine canine;
        System.out.println("Would you like info on a dog or a wolf? (dog/wolf)");
        String input2 = scanner.nextLine().toLowerCase();

        try{
            if (input2.equals("dog")){
                canine = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                        "German Shepherd Dog", "Black and Tan");
            }else if (input2.equals("wolf")){
                canine = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                        "Northwestern Wolf", false, "North America");
            }else{
                throw new IllegalArgumentException("The input you entered was invalid");
            }
            return canine;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return getCanine();
        }
    }

    /*
        TODO: Pick a new animal family (feline, some family of reptiles, your choice!)
        TODO: Implement at least two concrete classes of that family representing unique animals
            -> Give each of the animals properties
            -> Think about similarities between the two and differences
            -> Implement methods that represent an action each animal can take
        TODO: Create an abstract class that can be used to group the two animal together via inheritance
            -> [Your animal class] extends [Your abstract class]
            -> Take similar properties and methods from the concrete classes and put them in the abstract class
            -> Fulfill the abstract classes contracts using 'super()' and implementing abstract methods (if you have any)
        TODO: Have the abstract class inherit from the interface Describable
            -> Decide if you will fulfill Describable's contract in the abstract class (both new animals will have the same method implementation), or
            -> Will you decide to place the implementation in each unique concrete animal class
        TODO: Finally, tie in your new animal family to our existing AnimalTools class
            -> The user should be able to pick an animal family, THEN decide if they want details on a specific animal in that family
        TODO: Lastly, HAVE FUN WITH THIS! Use your imagination. If you want to do something unique or different, go for it!
        TODO: BONUS -> Create another abstract class that will umbrella both Canine and your new animal family's abstract class
                    -> Could we use this as a way to further simplify our code? Could it make our logic that decides what animal to print out a little easier?
     */
}

