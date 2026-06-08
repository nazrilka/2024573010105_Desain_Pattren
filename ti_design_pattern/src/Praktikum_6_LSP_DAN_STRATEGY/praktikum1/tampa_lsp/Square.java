package Praktikum_6_LSP_DAN_STRATEGY.praktikum1.tampa_lsp;

public class Square extends Rectangle{
    @Override
    public void setWidth(int width){
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height){
        super.setHeight(height);
        super.setWidth(height);
    }
}


