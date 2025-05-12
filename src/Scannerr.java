import java.util.Scanner;

public class Scannerr {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge(){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void main(String[] args) {
        Scannerr scanner = new Scannerr();
        scanner.readNameAndAge();
    }
}
