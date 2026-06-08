package Praktikum_6_LSP_DAN_STRATEGY.praktikum1.dengan_lsp;

public class Square implements Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public int calculateArea(){
        return side * side;
    }
}
