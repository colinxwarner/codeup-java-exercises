package animals;

public class AnimalApp {

    public static void main(String[] args) {
        AnimalTools.initializeAnimalSearch();
    }
}
    /*
        TODO: Erase the code from the body of your Rectangle and Square ***and ShapesTest*** classes.

        TODO: Inside of the shapes directory, create a Shape interface with the following methods:
            -> double getPerimeter();
            -> double getArea();

        TODO: Inside of shapes, create an abstract Quadrilateral class that implements Shape. This class should have:
            -> protected double fields for length and width. ***include data type***
            -> a constructor that accepts two doubles for the length and width and sets those fields.
            -> abstract methods for setting the length and width.

        TODO: *Hint* IntelliJ can automatically create the skeleton of all the methods that need to be implemented.

        TODO: Change your existing Square and Rectangle classes to extend Quadrilateral.
            -> Be sure to remove Square's inheritance from Rectangle
            -> Use the 'super' keyword in Square/Rectangle contructors to pass the length/widths along to Quadrilateral
            -> Find a way to pass only one argument to Square's constructor and use that value for super's length AND width!
            -> Hint: Do Square/Rectangle calculate anything in the same way? If so, perhaps that/those methods could be moved to the abstract class!

        TODO: Modify your ShapesTest class, use it to:
            -> Declare a variable of the type Quadrilateral named myShape.
            -> Test your code by creating instances of both Square and Rectangle
            -> Assign them to myShape so you can display the shape's area and perimeter.
            ***assign one instance type then refactor or create two variables?***

        TODO: Answer the following questions:
            -> What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

        TODO: Did you know? Interfaces can actually provide implementations for methods as of java 8 with the default keyword.
*/
