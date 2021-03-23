package prep.Foods;

public abstract class Food implements Consumable{

    private String name;
    private String description;
    private int calories;

    public Food(String name, String description, int calories) throws IllegalArgumentException{

        if (name == null || name.equals("")){
            throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", name));
        }

        if (description == null || description.equals("")){
            throw new IllegalArgumentException(String.format("The argument %s cannot be null or empty", description));
        }

        if (calories <= 0){
            throw new IllegalArgumentException(String.format("The argument %s cannot be less than 1", calories));
        }

        this.name = name;
        this.description = description;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void consume(){
        System.out.printf("NOM NOM NOM I HEART %s\n", name);
    }
}