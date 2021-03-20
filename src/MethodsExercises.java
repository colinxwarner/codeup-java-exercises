//import java.util.Formatter;
//import java.util.Scanner;
//
//public class MethodsExercises {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int firstInt = sc.nextInt();
//        System.out.print("Enter another integer: ");
//        int secondInt = sc.nextInt();
//        int result = 0;
////        EXERCISES
////        Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
////        Test your code by creating a main method and calling each of the methods you've created.
////
////        Basic Arithmetic
////
////        Create four separate methods. Each will perform an arithmetic operation:
////
////        Addition
////        Subtraction
////        Multiplication
////        Division
////        Each function needs to take two parameters/arguments so that the operation can be performed.
////        Test your methods and verify the output.
////        Add a modulus method that finds the modulus of two numbers.
////        Food for thought: What happens if we try to divide by zero? What should happen?
//
//        addTwoNumbers(firstInt,secondInt);
//        subtractTwoNumbers(firstInt, secondInt);
//        multiplyTwoNumbers(firstInt, secondInt);
//        divideTwoNumbers(firstInt, secondInt);
//        modulusTwoNumbers(firstInt, secondInt);
//        System.out.println("Multiplying your two integers results in a product of " + multiplyStarless(firstInt, secondInt, result));
//
////  Verify integer between 1-10
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//
//// FACTORIZE INTEGER BETWEEN 1 - 10
//        factorizeIt();
//
//// DICE ROLL
//        pairOfDice();
//
//    }
//
////---METHODS---
//
//// Addition
//    public static void addTwoNumbers(int a, int b) {
//        int sum = a + b;
//        System.out.printf("The sum of %d and %d = %d\n", a, b, sum);
//    }
//// Subtraction
//    public static void subtractTwoNumbers(int a, int b) {
//        int difference = a - b;
//        System.out.printf("%d take away %d = %d\n", a, b, difference);
//    }
//// Multiplication
//    public static void multiplyTwoNumbers(int a, int b) {
//        int product = a * b;
//        System.out.printf("The product of %d times %d = %d\n", a,b,product);
//    }
//// Division
//    public static void divideTwoNumbers(int a, int b) {
//        int quotient = a / b;
//        System.out.printf("The quotient of %d divided by %d = %d\n", a,b,quotient);
//    }
//// Modulus
//    public static void modulusTwoNumbers(int a, int b) {
//        int remainder = a%b;
//        System.out.printf("The remainder of %d divided by %d is %d.\n", a,b,remainder);
//    };
//
//    public static int multiplyStarless(int a, int b, int sum){
//
//        if(b > 0){
//            sum += a;
//            return multiplyStarless(a, b-1, sum);
//        }else{
//            return sum;
//        }
//    }
//
//// CHECK INTEGER
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        int checkInt = scanner.nextInt();
//
//        if(checkInt < min || checkInt > max){
//            System.out.println("You have not entered an acceptable value.");
//            System.out.print("Please enter a whole number between " + min + " and " + max + ": ");
//            return getInteger(min,max);
//        }else {
//            return checkInt;
//        }
//    }
////Calculate the factorial of a number.
////
////Prompt the user to enter an integer from 1 to 10.
////Display the factorial of the number entered by the user.
////Ask if the user wants to continue.
////Use a for loop to calculate the factorial.
////Assume that the user will enter an integer, but verify it’s between 1 and 10.
////Use the long type to store the factorial.
////Continue only if the user agrees to.
////A factorial is a number multiplied by each of the numbers before it.
////Factorials are denoted by the exclamation point (n!). Ex:
//
//// PRINT FACTORIAL
////    public static void factorizeIt (){
////        System.out.print("Enter a number between 1 and 10: ");
////        int userInput = getInteger(1, 10);
////        long factorial = 1;
////        int center = userInput + ((userInput - 1)*3);
////        StringBuilder centerStr = new StringBuilder(center);
////        centerStr.append("1");
////        Formatter f = new Formatter();
////        for(int i = 1; i <=userInput; i++){
////            factorial *= i;
////            if(i > 1){
////                centerStr.append(" x " + i);
////            }
////            System.out.printf("%d! = %-" + center + "s = %d\n", i, centerStr, factorial);
////        }
////        String anotherFactorial = "n";
////        System.out.print("Would you like to enter another number? (y or n) ");
////        Scanner another = new Scanner(System.in);
////        anotherFactorial = another.nextLine();
////        if(anotherFactorial.equalsIgnoreCase("y")){
////            factorizeIt();
////        }
////    }
//
////Create an application that simulates dice rolling.
////
////Ask the user to enter the number of sides for a pair of dice.
////Prompt the user to roll the dice.
////"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
////Use static methods to implement the method(s) that generate the random numbers.
////Use the .random method of the java.lang.Math class to generate random numbers.
////  http://math.hws.edu/eck/cs124/javanotes4/c5/ex-5-1-answer.html
//
//// ROLL THE DICE
//    public static void pairOfDice() {
//        System.out.print("For this pair of dice, how many sides does each die have? ");
//        Scanner gygax = new Scanner(System.in);
//        int dieSides = gygax.nextInt();
//        pressAnyKeyToContinue();
//        int[] diceRoll = rollTheDice(dieSides);
//        System.out.printf("You have rolled %d and %d!", diceRoll[0], diceRoll[1]);
//        System.out.println("Roll another pair of dice? (y/n) ");
//        String rollAgain = gygax.nextLine();
//        if(rollAgain.equalsIgnoreCase("y")){pairOfDice();}
//    }
//
//    public static int[] rollTheDice(int sides){
//        int[] dice = new int[2];
//        dice[0] = (int)(Math.random()*sides) + 1;
//        dice[1] = (int)(Math.random()*sides) + 1;
//        return dice;
//    }
//
//    private static void pressAnyKeyToContinue() {
//        System.out.println("Press Enter key to continue...");
//        try {
//            System.in.read();
//        }
//        catch(Exception e) {}
//    }
//
//
//
//
//
//
//        public static int getInteger(int min, int max){
//            Scanner sc = new Scanner(System.in);
//            System.out.printf("Enter a number between 1 and 10%n");
//            int intInput = sc.nextInt();
//            if(intInput < min || intInput > max){
//                System.out.printf("Invalid number, not within range %d and %d", min, max);
//                return getInteger(min, max);
//            } else{
//                System.out.printf("%d is valid, thank you", intInput);
//                return intInput;
//            }
//        }
//
//        public static int add(int x, int y){
//            return x + y;
//        }
//        public static int sub(int x, int y){
//            return x - y;
//        }
//        public static int mult(int x, int y){
//            return x * y;
//        }
//        public static int div(int x, int y){
//            return x / y;
//        }
//        public static int mod(int x, int y){
//            return x % y;
//        }
//
//
//        public static int multLoop(int x, int y){
//            int initialX = x;
//            for(int i = 1; i < y; i++){
//                x+=initialX;
//            }
//            return x;
//        }
//
//        public static boolean getInteger(int min, int max, int input){
//            return input >= min && input <= max;
//        }
//
//
//    }



/*
EXAMPLE FROM TRAVIS

// Bonus 1a - loop
public static int multiplyLoop(int num1, int num2) {
    int multiplied = 0;
    do {
        multiplied += num1;
        num2--;
    } while (num2 != 0);
    return multiplied;
}
// Bonus 1b - recursion
public static int multiplyRecursion(int num1, int num2) {
    int multiplied = 0;
    if (num2 != 0) {
        multiplied = num1 + multiplyRecursion(num1, num2 - 1);
    }
    return multiplied;
}
// Exercise 2
public static boolean isBetween(int min, int max, int check) {
    return (min <= check && max >= check);
}
public static int getRangeInput(int min, int max, Scanner input) {
    System.out.println("Enter a number between " + min + " and " + max + ":");
    return input.nextInt();
}
public static int getInteger(int min, int max, Scanner input) {
    int userInt = getRangeInput(1, 10, input);
    if (!isBetween(1, 10, userInt)) {
        System.out.println("Your number was not in the range");
        userInt = getInteger(min, max, input);
    }
    return userInt;
}

 */

/*

EXTRA METHOD EXERCISES FROM CASEY --- SEE JAVA WARMUPS IN JAVA PRACTICE PACKAGE ---

 Write a method named firstChar() that takes a string as an input and returns the first letter as a character data type.
    Write a method named secondChar() that takes a string as an input and returns the first letter as a character data type.
    Write a method named lastChar() that takes a string as an input and returns the last letter as a character data type.
    Write a method named secondToLastChar() that takes a string as an input and returns the second to letter as a character data type.
    Write a method named userWantsToContinue(). This method should prompt the user if they want to continue and then return a boolean value if the user inputs "y" or "yes".
    Write a method named isEven() that takes in an integer and returns a boolean if the input is even or not.
    Write a method named isOdd() that takes in an integer and returns a boolean if the input is odd or not.
    Write a method named countOdds(start, end) that returns an integer containing the integer that is the count of all odd numbers between the start and the end input integers.
    Write a method named countEvens(start, end) that returns an integer containing the integer that is the count of all even numbers between the start and the end input integers.
    Write a method named isVowel() that accepts a String input of length 1 and returns a boolean if that string is a vowel other than "y".
    Write a method named hasVowels() that accepts a string of any length and returns a boolean if there are any vowels in that string.
    Write a method named countVowels() that accepts a string of any length and returns an integer count of the number of vowels in the provided input String.
    Write a solution to FizzBuzz using recursion instead of a loop.
    Write a method named isPrime() that that accepts in an integer number and returns a boolean if the number is evenly divisible only by either 1 or the number itself.
    Write a method named getTwentyPrimes() that returns a string containing the first 20 prime numbers, each separated by a comma. Output: "1, 2, 3, 5, 7, 11, 13, 17, 19"... until we have a total count of 20 primes in the string.
*/
