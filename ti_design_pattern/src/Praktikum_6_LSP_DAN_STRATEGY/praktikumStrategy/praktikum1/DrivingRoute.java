package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum1;

public class DrivingRoute implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Driving route from " + origin + " to " + destination);
        System.out.println("Estimated time: 10 minutes by car");
    }
}