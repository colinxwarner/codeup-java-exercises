package animals;

import animals.Dog;
import animals.Wolf;
import java.util.Scanner;
public class AnimalApp {
    public static void main(String[] args) {
        getDetails();
    }
    public static void getDetails() {
        Dog dog = new Dog("Bork! Bork!", "Large", "Canis Lupus Familiaris",
                "German Shepherd Dog", "Black and Tan");
        Wolf wolf = new Wolf("Hoooowwwwwwlll!", "Medium", "Canis Lupus Occidentalis",
                "Northwestern Wolf", false, "North America");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 'dog' or 'wolf' to know its details: ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("dog")) {
            dog.printDetails();
        } else {
            wolf.printDetails();
        }
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