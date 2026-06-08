package Praktikum_6_LSP_DAN_STRATEGY.praktikum1.tampa_lsp;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public int calculateArea() {
        return  width * height;
    }

}
