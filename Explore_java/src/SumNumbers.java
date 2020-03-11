import java.util.*;
public class SumNumbers {

    static String userInput;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        process(scan);

        while (!userInput.equals("exit")) {
            process(scan);
        }
    }

    private static void process(Scanner scan) {
        System.out.println("Please Enter first number :");
        int first = Integer.parseInt(scan.nextLine());

        System.out.println("Please Enter second number :");
        int second = Integer.parseInt(scan.nextLine());

        System.out.println(add(first, second));

        System.out.println("Select the Option :");
        userInput = scan.nextLine();
    }

    private static int add(int first, int second) {
        return first + second;
    }

}
