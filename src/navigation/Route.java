package navigation;

public record Route(String mode, double distanceKm, int durationMinutes, String description) {

    @Override
    public String toString() {
        return "%s: %s, %.1f km, ~%d min".formatted(mode, description, distanceKm, durationMinutes);
    }
}