package Enkapsulasi.Latihan4;

public class UjiBus {
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(3);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.cetak();


    }
}
