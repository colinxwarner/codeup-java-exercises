public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s", this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Person p1 = new Person("bob");
//        System.out.println(p1.name);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.name);
//        System.out.println(person2.name);
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

}

/*
EXERCISES
Object basics

Create Person class inside of src that has a private name property that is a string, and the following methods:
public String getName(){
//TODO: return the person's name
}

public void setName(String name){
//TODO: change the name property to the passed value
}
public void sayHello(){
//TODO: print a message to the console using the person's name
}
The class should have a constructor that accepts a `String` value and sets
the person's name to the passed string.

Create a `main` method on the class that creates a new `Person` object and
tests the above methods.

Understanding references

The following code blocks make use of the Person class from the previous exercise.
For each code block, think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.
Person person1 = new Person("John");
Person person2 = new Person("John");
System.out.println(person1.getName().equals(person2.getName()));
System.out.println(person1 == person2);

Person person1 = new Person("John");
Person person2 = person1;
System.out.println(person1 == person2);

Person person1 = new Person("John");
Person person2 = person1;
System.out.println(person1.getName());
System.out.println(person2.getName());
person2.setName("Jane");
System.out.println(person1.getName());
System.out.println(person2.getName());

Create an input validation class

Create a package inside of src named util. Inside of util, create a class named Input that has a private property named scanner. When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:

String getString()
boolean yesNo()
int getInt(int min, int max)
int getInt()
double getDouble(double min, double max)
double getDouble()
The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.

The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max.
The getDouble method should do the same thing, but with decimal numbers.

Create another class named InputTest that has a static main method that uses all the methods from the Input class.

Bonus

Allow all of your methods for getting input to accept an optional String parameter named prompt.
If passed, the method should show the given prompt to the user before parsing the input.

Circle class

Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle.
This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle,
 detailed below.

public Circle(double radius)
public double getArea()
public double getCircumference()

Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class,
creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)

The formulas for the circumference and area:
circumference = 2 x pi x radius
area = pi x (radius ^ 2)

For the value of pi, use the PI constant of the Math class.

Bonus

After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
Continue creating circles and displaying information about them until the user says they do not want to continue.

Before exiting, the program should output the total number of circles created.
Use a private static property, along with a public static method to keep track of and display the total number of circles created.

*/