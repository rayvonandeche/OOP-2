public class Decision {
    void checkTemperature(int temperature) {
        if (temperature > 30) {
            System.out.println("It's too hot");
        } else if (temperature < 10) {
            System.out.println("It's too cold");
        } else {
            System.out.println("It's warm");
        }
    }
}
