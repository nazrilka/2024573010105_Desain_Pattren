package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum2;

public class BrightFilter implements FilterStrategy {
    public void apply(String fileName) {
        System.out.println("Menerapkan filter cerah pada " + fileName);
    }
}