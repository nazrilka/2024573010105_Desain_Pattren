package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum1;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new WalkingRoute());
        navigator.navigate("Home", "School");

        System.out.println();

        navigator.setRouteStrategy(new DrivingRoute());
        navigator.navigate("Home", "Office");

        System.out.println();

        navigator.setRouteStrategy(new PublicTransportRoute());
        navigator.navigate("Home", "Mall");
    }
}
