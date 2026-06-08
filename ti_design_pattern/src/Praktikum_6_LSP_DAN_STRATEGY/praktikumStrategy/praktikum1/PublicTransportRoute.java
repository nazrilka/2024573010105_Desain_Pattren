package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum1;

public class PublicTransportRoute implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Public transport route from " + origin + " to " + destination);
        System.out.println("Estimated time: 20 minutes by bus");
    }
}