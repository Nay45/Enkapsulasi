package Enkapsulasi.Latihan2;

public class UjiBus {
    public static void main(String[] args) {

        Bus busMini=new Bus(10); // set awal maxpenumpang

        // output hasil menggunakan nameclass.method cetak()
        busMini.cetak();

        busMini.pluspenumpang(3); // param penumpang
        busMini.cetak();

        busMini.pluspenumpang(1); // param penumpang
        busMini.cetak();

        busMini.pluspenumpang(1); // param penumpang
        busMini.cetak();


    }
}
