package oopLecture;

public class oopLecture {

    public static void main(String[] args) {

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

//        class Dish {
//            public int costInCents;
//            public String nameOfDish;
//            public boolean wouldRecommend;
//
//            public String printSummary() {
//                return String.format("Cost: %d \n Name: %s \n Recommended: %b", costInCents, nameOfDish, wouldRecommend );
//
//            }
//
//            public static void DishTest()
//        }
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

