import java.util.Locale;


public class DishTools {
    // Only meant to be accessed STATICALLY

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shout(Dish dishObj) {
        System.out.printf("%n%s!",dishObj.shareNameOfDish().toUpperCase());
    }


    public static void analyzeDishCost(Dish dishObj) {
        if (dishObj.shareCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("\nMore expensive than average");
        } else if (dishObj.shareCostInCents() == AVERAGE_COST_OF_DISH_IN_CENTS)
            System.out.println("\naverage price");
        else {
            System.out.println("\nLess expensive than average");
        }
    }

    public static void flipRecommendation(Dish dishObj) {
        dishObj.changeWouldRecommend(!(dishObj.shareWouldRecommend()));
        System.out.println("New \"wouldRecommend\" value: " + dishObj.shareWouldRecommend());
    }

}

// TODO:
//  - Create a class of static members (variables and methods) called DishTools
//  - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//  - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//  - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//  - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
//  - Try out the DishTools methods with Dish objects in the DishTest main method
