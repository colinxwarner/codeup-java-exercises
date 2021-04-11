package oopLecture;

public class oopLecture {

    public static void main(String[] args) {

//## Intro to Object Oriented Programming

//#### Key Vocabulary Terms
//
//     Object - a single location in memory having *state* and *behavior* specified by `properties` and `methods`. Think about software objects in terms of the *nouns* and *verbs* of real business processes.
//     Class - template/blueprint/recipe for creating multiple objects of the same type. Classes also provide a way to group place for static methods/properties
//     Instance - A single object of a given class, created with the `new` keyword. `new ClassName()` creates a new object in memory. Each object instance belongs to the same type of object, but is separate and distinct from each other object instance. To *instantiate* means to create a new instance.
//     Constructor - the method that creates an object. Constructor is called when you run `new ClassName()`
//     Visibility - What other code should be able to see your object, its properties, and call its methods? What should be public, protected, or private depends on the scenario. Favor hiding/encapsulating functionality and exposing public methods only when you need a way for other code to communicate to the object.
//     Static - contrary to the dictionary definition of unchanging, static means that a property or method belongs to the class and that we don't need to have any objects created in order to access either the property or method.

//#### Key Concepts
//
//        - Encapsulation - hiding the internals of an object's behavior behind private/protected methods. The public methods on an object are its API. Each public method/property gives another puppet string on an object to other parts of the application. Each public method allows the object to be tangled with other objects, so be careful how much you make public.
//
//        - Data transfer objects - objects that exist to provide data and only data, not operations on that data.
//
//#### How to think in terms of objects/classes
//
//        1. Static does *not* mean unchanging, but rather a property or method that belongs to the class. You don't need an object to call a static method.
//        2. All Java code exists in classes. If you "just need a plain ol' function" then you will define a static method in a class.
//
//        3. Objects should represent the state and behavior of the *nouns* and *verb*s in real world scenarios and business processes. Use objects to model the responsibilities of programs.
//
//================================= OOP PRE-LECTURE RESEARCH QUESTIONS
//                What is the difference between static and instance methods/variables?
//                What is an instance and what is instantiation?
//                What is an object in Java?
//                What is a class in Java?
//                What is the difference between a class and an object?
//                What is a constructor?
//                What are some uses of the ‘final’ keyword?
//                What are some uses of the ‘this’ keyword?
//                What are visibility modifiers?
//                Why use private visibility?
//
//================================= OOP INTRO
//
//        -- UP TO NOW --
//
//                - using functions/methods to group together steps for a program to work
//
//
//        -- DEFINITION --
//
//        OOP - Object-oriented programming
//
//        - A programming paradigm where state (data/properties) and behavior (functionality/methods)
//        are grouped together (often into objects)
//        - Objects in Java are created from classes (a blueprint for an object/instance)

//        -- ADVANTAGES OF OOP --
//
//                Programming in an Object-oriented way can be used to develop code with a clearer and more modular organization in the following ways:
//
//        - implementation details can be abstracted away making code more readable (Abstraction)
//                - restriction of access to various levels of abstraction preventing data inconsistencies (Encapsulation)
//                - duplication is minimized through inheritance hierarchies (Inheritance)
//                - flexible code where multiple implementations may be swapped out behind a common interface (Polymorphism)
//
//
//
//
//                -- THE FOUR PILLARS OF OOP --
//
//        1. Abstraction - keep it clean
//        2. Encapsulation - keep it contained
//        3. Inheritance - keep it DRY - (Don't Repeat Yourself)
//        4. Polymorphism - keep it versatile
//
//        https://medium.com/@hamzzza.ahmed95/four-pillars-of-object-oriented-programming-oop-e8d7822aa219
//
//        https://java.codeup.com/appendix/slides/
//
//        Today (09 MAR 2021) we will focus on Abstraction and Encapsulation.
//
//================================= OOP PRE-LECTURE RESEARCH QUESTIONS ========================
//                What is the difference between static and instance methods/variables?
//                What is an instance and what is instantiation?
//                What is an object in Java?
//                What is a class in Java?
//                What is the difference between a class and an object?
//                What is a constructor?
//                What are some uses of the ‘final’ keyword?
//                What are some uses of the ‘this’ keyword?
//                What are visibility modifiers?
//                Why use private visibility?
//
//        -- CONCEPTS COVERED --
//
//                - how to create custom classes and objects from these classes
//                - defining and using instance and static fields
//                - how to control class constructors
//                - using the "this" keyword
//                - controlling encapsultation with visibility modifiers

        // ======================== slide 3 (classes and objects)
//
//            Person p1 = new Person();
//            p1.firstName = "Justin";
//            p1.lastName = "Reich";
//            System.out.println(p1.lastName);

//            Person p2 = new Person();
//            p2.firstName = "Justin";
//            p2.lastName = "Reich";

//            System.out.println(p1);
//            System.out.println(p2);

//            Person justinImposter = p2;
//
//            System.out.println(justinImposter);
//            System.out.println(p2);

//            System.out.println(p1 == p2);

//            p1.firstName = "Rick";
//            p1.lastName = "Sanchez";
//            System.out.println(p1.firstName);
//            System.out.println(p1.lastName);


//            System.out.println(p1.firstName);
//            System.out.println(p1.lastName);

//
//            Person fred = new Person();
//            fred.firstName = "Fred";
//            fred.lastName = "Smith";
//            System.out.println(fred.firstName);
//            System.out.println(fred.lastName);



        // -- Dog Example --


//            Dog d1 = new Dog();
//
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";



        // ======================== slide 4 (object fields)

//            Person rick = new Person();
//            rick.firstName = "Rick";
//            rick.lastName = "Sanchez";
//            System.out.println(rick.sayHello());

        // -- Dog Method Example --

//            Dog d1 = new Dog();
//            d1.age = 3;
//            d1.breed = "corgi";
//            d1.canBreed = false;
//            d1.name = "Tater";
//
//            d1.callForDog("Tater");

//        -- OOP SHORT ASSIGNMENT #1 --
//        Create a class called Dish. This class will represent various restaurant dishes.
//        Include an integer property called “costInCents”
//        Include a string property called “nameOfDish”
//        Include a boolean property called “wouldRecommend”
//        Include a method called “printSummary” with a void return type
//        this method will use a single printf method to print out the values of each of the instance properties in the following format:
//        Cost: COST_IN_CENTS_HERE
//        Name: NAME_OF_DISH_HERE
//        Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
//        Create another class called DishTest
//                Add a main method and inside the method...
//        1) instantiate a Dish object and assign to a variable called dish1
//        2) assign creative values for each of the properties
//        3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
//        -- SHORT ASSIGNMENT #2 --
//        Create a class of static members (variables and methods) called DishTools
//        - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//                - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//                - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//                - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//        Try out the DishTools methods with Dish objects in the DishTest main method

//--------SEE JAVA PRACTICE PACKAGE----------

        // ======================== slide 5 (class fields)


//            System.out.println(Arithmetic.PI);
//            System.out.println(Arithmetic.add(5, 5));
//            System.out.println(Arithmetic.multiply(5, 5));

        // -- DogHelper Example --




        // ======================== slide 7 (class vs. object fields)

//            Person theBestDrummerAlive = new Person();
//            theBestDrummerAlive.name = "Neil Peart";
//            Person.worldPopulation += 1; // accessing a static property
//
//            System.out.println(Person.worldPopulation);
//
//            // this also works, but is usually not a good idea
//            System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//            System.out.println(theBestDrummerAlive.name);



        // ======================== slide 8 (constructors)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.println(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 9 (this keyword)

//            Student jane = new Student("Jane Doe", "Zion");
//            System.out.print(jane.name + " - ");
//            System.out.println(jane.cohort); // prints "Jane Doe - Zion"
//            Student john = new Student("John Doe");
//            System.out.print(john.name + " - ");
//            System.out.println(john.cohort); // prints "John Doe - Unassigned"


        // ======================== slide 10 (visibility)

//            Student student = new Student("John Doe", 82.4);
//            System.out.println(student.name) // "John Doe"
//            // DON'T DO THIS - can't access private properties outside the class
//            System.out.println(student.grade);
//            System.out.println(student.shareGrade()); // Do this instead


    }

}

