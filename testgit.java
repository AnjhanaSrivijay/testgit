import java.util.Scanner;

public class testgit {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Greetings");
        System.out.println("Select one or two(1/2):  ");
        int input = in.nextInt();
        if (input == 1) {
            System.out.println("Hi, How are you doing today :)");
        } else {
            System.out.println("hello and bye");
        }
    }
}
