package navigation;

public class CycleStrategy implements RouteStrategy {
    private static final double AVERAGE_SPEED_KMH = 15;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60);
        return new Route("Cycle", distanceKm, minutes,
                from + " -> " + to + " via bike lanes");
    }
}