import java.util.Scanner;

public class testgit {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Greetings");
        System.out.println("Select one or two(1/2):  ");
        int input = in.nextInt();

        if (input == 1) {
            System.out.println("Hi, How are you doing today :)");
            System.out.println(testgit.hello());

        } else {
            System.out.println("hello and bye");
            System.out.println(testgit.hello());

        }

    }

    public static String hello(){
        return "Thank you for using Greeting!  See you soon!";

    }
}
