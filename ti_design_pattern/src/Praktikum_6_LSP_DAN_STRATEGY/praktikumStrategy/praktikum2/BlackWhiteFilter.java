package Praktikum_6_LSP_DAN_STRATEGY.praktikumStrategy.praktikum2;

public class BlackWhiteFilter implements FilterStrategy {
    public void apply(String fileName) {
        System.out.println("Menerapkan filter hitam-putih pada " + fileName);
    }
}