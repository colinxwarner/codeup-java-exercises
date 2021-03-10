import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        System.out.println("Ask a question to Bob");
        Scanner sc = new Scanner(System.in);
        String BobInput = sc.nextLine();
        System.out.println();
        if (BobInput.endsWith("?")){
            System.out.println("Sure.");
        } else if (BobInput.endsWith("!")){
            System.out.println("Whoa, chill out");
        } else if (BobInput.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }


    }
}
