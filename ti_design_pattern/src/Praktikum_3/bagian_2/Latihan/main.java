package Praktikum_3.bagian_2.Latihan;

public class main {
    public static void main(String[] args){
        motor mtr1 = new motor();
        mtr1.setMerek("BMW s1000rr");
        mtr1.setTahun(2006);

        System.out.println("Merek:" + mtr1.getMerek());
        System.out.println("Merek:" + mtr1.getTahun());

    }
}
