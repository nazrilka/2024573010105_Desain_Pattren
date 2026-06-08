package Praktikum_6_LSP_DAN_STRATEGY.praktikum1.dengan_lsp;

public class Rectangle implements Shape{
    private int  width;
    private  int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

     public int calculateArea() {
        return width * height;
    }
}
