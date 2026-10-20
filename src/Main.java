import navigation.CarStrategy;
import navigation.CycleStrategy;
import navigation.Navigator;
import navigation.WalkStrategy;
import navigation.PublicTransportStrategy;

public class Main {
    public static void main(String[] args) {
        String from = "Home";
        String to = "University";
        double distanceKm = 8;

        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.plan(from, to, distanceKm));

        navigator.setStrategy(new WalkStrategy());
        System.out.println(navigator.plan(from, to, distanceKm));

        navigator.setStrategy(new CycleStrategy());
        System.out.println(navigator.plan(from, to, distanceKm));

        navigator.setStrategy(new PublicTransportStrategy());
        System.out.println(navigator.plan(from, to, distanceKm));
    }
}