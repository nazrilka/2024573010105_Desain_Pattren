package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum1;

public class WalkingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Walking route from " + origin + " to " + destination);
        System.out.println("Estimated time: 30 minutes on foot");
    }
}