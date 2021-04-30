import util.Input;

public class ErrorsAndExceptions {

    public static void main(String[] args) {

        // getInt test:
        System.out.println("\n***getInt() test. Enter a whole number or string:");
        Input userInt = new Input();
        System.out.println(userInt.getInt());
        System.out.println("that was the correct input\n-----------------");


        // getDouble() test:
        System.out.println("\n***getDouble() test. Enter a number or string:");
        Input userDouble = new Input();
        System.out.println(userDouble.getDouble());
        System.out.println("that was the correct input\n-----------------");



    }

}


