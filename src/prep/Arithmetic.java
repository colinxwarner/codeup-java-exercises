package prep;

public class Arithmetic {

    public static int square(int number){
        return number * number;
    }

    public static int sum(int[] numbers){
        int sum = 0;

        for (int num : numbers){
            sum += num;
        }
        return sum;
    }

    public static int difference(int num1, int num2){
        return num1 - num2;
    }

    public static double product(double num1, double num2){
        return num1 * num2;
    }

    public static double average(int[] numbers){
        int sum = sum(numbers);
        return (double) sum / numbers.length;
    }

}

//package prep;
//
//public class Arithmetic {
//
//    public static boolean product;
//
//    protected static int square(int int1) {
//        return int1 * int1;
//    }
//
//    protected static int sum(int int1, int int2) {
//        return int1 + int2;
//    }
//
//    protected static int difference(int int1, int int2) {
//        return int1 - int2;
//    }
//
//    protected static int product(int int1, int int2) {
//        return int1 * int2;
//    }
//
//    protected static double getAverage(int[] arr) {
//        double sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        return sum / arr.length;
//    }
//
//}
/*
square - takes in an int argument, returns the square of that number as an int
sum - takes in two numeric (your choice of type) arguments, returns the sum of both
difference - takes in two numeric (your choice of type) arguments, returns the difference between the two
product - takes in two numeric (your choice of type) arguments, returns the product (multiply)
average - takes in a numeric array as an argument, returns the average of that array
 */