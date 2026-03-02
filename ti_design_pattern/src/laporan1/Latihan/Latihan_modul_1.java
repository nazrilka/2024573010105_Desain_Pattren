package Praktikum1.Latihan;

public class Latihan_modul_1 {
    public static void main(String[] args){
        int umur =20;
        double tinggi = 1.75;
        boolean isMahasiswa = true;
        char gender = 'L';
        String fullname = "Nazril";
        String DerthOfPlace = "Jakarta";
        String DateOfBirth = "19 Agust 2005";
        String BloodType = "O";
        String Religion = "Islam";
        String Occupation = "Mahasiswa";

            String[] biodata = {
                "Nama: " + fullname,
                "Umur: " + umur,
                "Tinggi: " + tinggi,
                "Mahasiswa: " + isMahasiswa,
                "Gender: " + gender,
                "Tempat Lahir: " + DerthOfPlace,
                "Tanggal Lahir: " + DateOfBirth,
                "Golongan Darah: " + BloodType,
                "Agama: " + Religion,
                "job: " + Occupation
        };

        for (int i = 0; i < biodata.length; i++) {
            System.out.println(biodata[i]);

        };
    }
}
