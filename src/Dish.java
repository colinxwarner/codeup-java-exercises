public class Dish {

    private int costInCents;

    private String nameOfDish;

    private boolean wouldRecommend;

    // Constructor:

    public Dish (String name, int cost, boolean recommend){
        this.nameOfDish = name;
        this.costInCents = cost;
        this.wouldRecommend = recommend;
    }

    // Getters:

    public int shareCostInCents(){
        return costInCents;
    }

    public String shareNameOfDish(){
        return nameOfDish;
    }

    public boolean shareWouldRecommend(){
        return wouldRecommend;
    }

    // Setters:

    public void changeCostInCents(int cost){
        this.costInCents = cost;
    }

    public void changeNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public void changeWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.printf(
                "Cost: $%d%nName: %s%nRecommended: %b", costInCents, nameOfDish, wouldRecommend);
    }

}

// TODO:
//  - Create a class called Dish. This class will represent various restaurant dishes.
//  - Include an integer property called “costInCents”
//  - Include a string property called “nameOfDish”
//  - Include a boolean property called “wouldRecommend”
//  - Include a method called “printSummary” with a void return type
//    this method will use a single printf method to print out the values of each of the instance properties in the following format:
//      Cost: COST_IN_CENTS_HERE
//      Name: NAME_OF_DISH_HERE
//      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE

// TODO: mini-exercise 3
//  Refactor your Dish and DishTest classes...
//  1) Change all properties in the Dish class to private visibility (printSummary should remain public)
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
//  3) Refactor code as needed in DishTest to access and modify dish object property values
//  4) Add a constructor method to Dish that will assign all properties
//  5) Refactor DishTest again to use the constructor to set all property values rather than setter methods