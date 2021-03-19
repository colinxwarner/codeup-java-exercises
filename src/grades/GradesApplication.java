package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Student> studentsInfo = new HashMap<>();

        ArrayList<Integer> colinGrades = new ArrayList<>();
        Student colin = new Student("Colin", colinGrades, "colinxwarner");
        colin.addGrade(100);
        colin.addGrade(90);
        colin.addGrade(80);
        String colinUN = colin.getGhName();
        studentsInfo.put(colinUN, colin);

        ArrayList<Integer> justinGrades = new ArrayList<>();
        Student justin = new Student("Justin", justinGrades, "jreich5");
        justin.addGrade(94);
        justin.addGrade(86);
        justin.addGrade(99);
        String justinUN = justin.getGhName();
        studentsInfo.put(justinUN, justin);

        ArrayList<Integer> caseyGrades = new ArrayList<>();
        Student casey = new Student("Casey", caseyGrades, "vegetasrevenge");
        casey.addGrade(89);
        casey.addGrade(91);
        casey.addGrade(90);
        String caseyUN = casey.getGhName();
        studentsInfo.put(caseyUN, casey);

        ArrayList<Integer> ryGrades = new ArrayList<>();
        Student ry = new Student("Ry", ryGrades, "ryancesutton");
        ry.addGrade(100);
        ry.addGrade(87);
        ry.addGrade(88);
        String ryUN = ry.getGhName();
        studentsInfo.put(ryUN, ry);


        System.out.println("Howdy");
        System.out.println("Here is a list of GitHub usernames of our students");
        System.out.println("|" + colinUN + "| |" + justinUN + "| |" + caseyUN + "| |" + ryUN + "|");
        ArrayList<String> users = new ArrayList<>(Arrays.asList(colinUN, justinUN, caseyUN, ryUN));


        boolean keepGoing = true;
        do {
            System.out.println("Who do you want to creep on today?");
            String choice = sc.next();

            if (users.contains(choice)) {
                System.out.printf("Name: %s - GitHub Username: %s %nCurrent Average: %f %n", studentsInfo.get(choice).getName(), choice, studentsInfo.get(choice).getGradeAverage(studentsInfo.get(choice).getGrade()));
            } else {
                System.out.printf("404 not found for %s%n", choice);
            }

            System.out.println("Would you like to stalk someone else? [y]es");
            String goAgain = sc.next();
            if (!goAgain.equalsIgnoreCase("Y")) {
                keepGoing = false;
                System.out.println("Thank you for using the NSA database. Our agents are on the way to your location!");
            }

        } while (keepGoing);


    }


}
