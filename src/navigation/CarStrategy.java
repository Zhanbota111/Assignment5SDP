package navigation;

public class CarStrategy implements RouteStrategy {
    private static final double AVERAGE_SPEED_KMH = 50;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60);
        return new Route("Car", distanceKm, minutes,
                from + " -> " + to + " via highways and main roads");
    }
}