public class Variables {
    void showInterest() {
        double amount;
        double interest;

        amount = 1200.00;
        System.out.println("The amount is: " + amount);

        interest = 3;
        amount = amount * (100 + interest) / 100;
        System.out.println("The amount after a year is: " + amount);


    }

    public static void main(String[] args) {
        (new Variables()).showInterest();
    }
}
