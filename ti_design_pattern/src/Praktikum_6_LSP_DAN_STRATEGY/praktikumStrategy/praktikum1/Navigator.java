package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum1;

public class Navigator {
    private RouteStrategy routeStrategy;

    public Navigator(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String origin, String destination) {
        routeStrategy.buildRoute(origin, destination);
    }
}