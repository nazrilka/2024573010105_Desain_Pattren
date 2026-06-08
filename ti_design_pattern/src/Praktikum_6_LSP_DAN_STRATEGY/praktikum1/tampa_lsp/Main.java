package Praktikum_6_LSP_DAN_STRATEGY.praktikum1.tampa_lsp;

public class Main {
    public static void testRectangle(Rectangle r){
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Hasil yang di harapkan: 20 Hasil output:" + r.calculateArea());

    }
    public static void main (String[] args){
        Rectangle rect = new Rectangle();
        testRectangle(rect);

        Rectangle square = new Square();
        testRectangle(square);
    }
}
