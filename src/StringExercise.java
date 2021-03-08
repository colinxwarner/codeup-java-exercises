public class StringExercise {
    public static void main(String[] args) {

//        For each of the following output examples, create a string variable named message
//        that contains the desired output and print it out to the console.


//        We don't need no education
//        We don't need no thought control

        String output = "We don't need no education\n";
        output += "We don't need no thought control";

        System.out.println(output);

//        Check "this" out!, "s inside of "s!

        String output2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(output2);

//        In windows, the main drive is usually C:\

        String output3 = "In windows, the main drive is usually C:\\";

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String output4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\";
        System.out.println(output4);
    }
}



//  Create a class named Bob with a main method for the following exercise.
//
//  Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//  Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//  He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//  He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//  He answers 'Whatever.' to anything else.
//  Write the Java code necessary so that a user of your command line application can have a conversation with Bob.



//LECTURE
//
//public class StringLecture {
//
//    public static void main(String[] args) {

//        .equals(String anotherString)

//        String one = "2";
//        String two = "2";
//        System.out.println(one.equals(two));


//        .equalsIgnoreCase(String anotherString)

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

//        String title = "Dr. Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor);


//        .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup);


//        .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        System.out.println(word.charAt(2));

//        char firstLetter = word.charAt(0); // 't'
//
//        // 't' == 'T'
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
////
//        System.out.println(firstLetterCapitalized);

//        char s = word.charAt(2);


//        .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("z"));


//        .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));
//        System.out.println(good.lastIndexOf("o"));


//        .length()

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


//        .replace(char oldChar, char newChar)

//        String search = "tiny cats looking cute cats";
//        System.out.println(search.lastIndexOf("cats"));
//        String catAndDog = search.substring(0, search.lastIndexOf("cats"));
//        System.out.println(catAndDog + "dogs");
//
//        String newStr = search.replace(" ", ",");
//        System.out.println(newStr);


//        .substring(int beginIndex[, int endIndex])

//        String name = "Justin Bob Reich";
//        String firstName = name.substring(0, 6);
//        System.out.println(firstName);
//
//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);
//        System.out.println(name.substring(3));


//        .toLowerCase()
//        .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


//        .trim()

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.print("|" + trimmedInput + "|");


//         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//    String word1 = "cat";
//    String pigLatinWord = word1
//        .trim()
//        .toLowerCase()
//        .substring(1)
//        .concat(word1.substring(0, 1).toLowerCase())
//        .concat("ay");
//    System.out.println(pigLatinWord);

