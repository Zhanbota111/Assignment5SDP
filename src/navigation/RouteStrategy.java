package navigation;

public interface RouteStrategy {
    Route buildRoute(String from, String to, double distanceKm);
}