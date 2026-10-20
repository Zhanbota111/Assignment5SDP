package navigation;

public class PublicTransportStrategy implements RouteStrategy {
    private static final double AVERAGE_SPEED_KMH = 25;
    private static final int WAITING_TIME_MINUTES = 7;

    @Override
    public Route buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) Math.round(distanceKm / AVERAGE_SPEED_KMH * 60) + WAITING_TIME_MINUTES;
        return new Route("Public transport", distanceKm, minutes,
                from + " -> " + to + " by bus");
    }
}