package Enkapsulasi.TugasPraktikum.No2;

public class OutputBola {
    public static void main(String[] args) {

        // Deklarasi jari jari
        double jarijari = 2;

        // Membuat object
        Bola bola1 = new Bola(7);

        // Menampilkan hasil
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
        System.out.println("");

        /// Memanipulasi object bola
        bola1.setJarijari(jarijari);
        bola1.showDiameter();
        bola1.showLuasPermukaan();
        bola1.showVolume();
    }
}
