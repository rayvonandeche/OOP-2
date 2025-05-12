import java.util.Scanner;

public class While {
    class HelloTillStop {
        Scanner scanner = new Scanner(System.in);

        void showHello() {
            String choice;

            System.out.println("For Hello type h, anything else to stop");
            choice = scanner.nextLine();
            while (choice.equals("h")) {
                System.out.println("Hello");
                choice = scanner.nextLine();
            }
        }
    }
}
