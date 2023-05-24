public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        User user1 = new User();
        User user2 = new User();

        weatherStation.add(user1);
        weatherStation.add(user2);

        weatherStation.setTemperature(25);

        System.out.println(user1.getTemperature());
        System.out.println(user2.getTemperature());

        weatherStation.setTemperature(28);

        System.out.println(user1.getTemperature());
        System.out.println(user2.getTemperature());
    }
}