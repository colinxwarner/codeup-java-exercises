public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        ============================ SYNTAX, TYPES, VARIABLES EXERCISE
//
//         Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//             int myFavoriteNumber = 7;
//             System.out.println(myFavoriteNumber);
//
//         Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//             String myString = "Hello";
//             System.out.println(myString);
//
//         Change your code to assign a character value to myString. What do you notice?
//             myString = 'h'; // ERROR
//             System.out.println(myString);
//
//         Change your code to assign the value 3.14159 to myString. What happens?
//             myString = 3.14159; // ERROR
//
//         Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//              long myNumber;

//         Change your code to assign the value 3.14 to myNumber. What do you notice?
//             myNumber = 3.14; // ERROR
//
//         Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//             myNumber = 123L;
//
//         Change your code to assign the value 123 to myNumber.
//             myNumber = 123;
//
//         Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
////             Longs can only hold integers
//
//         Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//             float myNumber = 3.14F; // ERROR
//             use F after the number or explicit casting
//
//
//         Copy and paste the following code blocks one at a time and execute them

//             int x = 5;
//             System.out.println(x++);
//             System.out.println(x);
//
//             int x = 5;
//             System.out.println(++x);
//             System.out.println(x);
//
//
//         What is the difference between the above code blocks? Explain why the code outputs what it does.
//
////             the difference between pre and post increment
//
//         Try to create a variable named class. What happens?
//
//             ERROR unexpected identifier

//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
//            error caught at runtime

//        How is the above example different from the code block below?
//            int three = (int) "three"; // error caught during compilation
//
//         Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x = x + 5;
//        REFACTOR
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        REFACTOR
//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        REFACTOR
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        max++;
//        min--;
//        System.out.println(max);
//        System.out.println(min);

    }
}

/**
 * Exercises
 * You should complete all of the following inside of your main method from the previous exercise. After each step, compile and run your code.
 * <p>
 * Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
 * <p>
 * Create a String variable named myString and assign a string value to it, then print the variable out to the console.
 * <p>
 * Change your code to assign a character value to myString. What do you notice?
 * <p>
 * Change your code to assign the value 3.14159 to myString. What happens?
 * <p>
 * Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
 * <p>
 * Change your code to assign the value 3.14 to myNumber. What do you notice?
 * <p>
 * Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
 * <p>
 * Change your code to assign the value 123 to myNumber.
 * <p>
 * Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
 * <p>
 * Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
 * <p>
 * Copy and paste the following code blocks one at a time and execute them
 * <p>
 * int x = 5;
 * System.out.println(x++);
 * System.out.println(x);
 * <p>
 * int x = 5;
 * System.out.println(++x);
 * System.out.println(x);
 * <p>
 * What is the difference between the above code blocks? Explain why the code outputs what it does.
 * <p>
 * Try to create a variable named class. What happens?
 * <p>
 * Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
 * <p>
 * String theNumberThree = "three";
 * Object o = theNumberThree;
 * int three = (int) o;
 * <p>
 * Copy and paste the code above and then run it. Does the result match with your expectation?
 * <p>
 * How is the above example different from the code block below?
 * <p>
 * int three = (int) "three";
 * <p>
 * What are the two different types of errors we are observing?
 * <p>
 * Rewrite the following expressions using the relevant shorthand assignment operators:
 * <p>
 * int x = 4;
 * x = x + 5;
 * <p>
 * int x = 3;
 * int y = 4;
 * y = y * x;
 * <p>
 * int x = 10;
 * int y = 2;
 * x = x / y;
 * y = y - x;
 * <p>
 * What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
 * <p>
 * Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
 **/