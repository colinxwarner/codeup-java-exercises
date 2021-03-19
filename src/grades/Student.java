package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grade;
    private String ghName;

    public Student(String name, ArrayList<Integer> grade, String gh){
        this.name = name;
        this.grade = grade;
        this.ghName = gh;
    }

    public String getName(){   //returns student's name
        return this.name;
    }
    public ArrayList<Integer> getGrade(){   //returns student's grade
        return this.grade;
    }
    public void addGrade(int grade){   //adds the given grade to the grades property
        this.grade.add(grade);
    }
    public double getGradeAverage(ArrayList<Integer> grades){   //returns the average of the students grades
        double total = 0;
        double len = grades.size();
        for(int grade : grades){
            total += grade;
        }
        return total / len;
    }

    public String getGhName(){
        return this.ghName;
    }

}

/*
Tips for the exercise:
focus on completing each step in order
don’t worry so much about how your code is organized (get it working then go back and refactor)
test as you go (don’t try to build everything first then run it hoping for the best; build it up in small steps that you verify along the way)
remember that if you have been stuck for more than 15-20 minutes, reach out for help in your breakout room, and if that doesn’t work, post a question in luna-questions

 Hints for the exercise:
GradesApplication could be made up of several static methods to run the command line application
one of these static methods could be used to populate a HashMap of students for the command line app to work with
one approach to breaking it into small steps:
create the Student class with all methods and properties from the instructions
create the GradesApplication class with a method to create a HashMap of students
create a main method to define logic for running the command line app to view the HashMap
at some point, you will need to iterate over the keys in the HashMap to display the usernames (check out this link: https://stackoverflow.com/questions/46898/how-do-i-efficiently-iterate-over-each-entry-in-a-java-map)
start first by just having the app finish with a single input from the user (ending with the happy or sad path, depending on whether the key was in or not in the HashMap)
add the feature for the user to continue entering in student usernames until they choose to exit
using the Input class from a previous exercise will be helpful here
after the app is working, you can break up the main method into smaller static methods to separate concerns

 */