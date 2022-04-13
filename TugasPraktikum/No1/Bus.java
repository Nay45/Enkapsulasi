package Enkapsulasi.TugasPraktikum.No1;

class Bus {
    // Deklarasi
    private double penumpang, maxPenumpang, counter, penumpangBaru;


    // Constructor (Method yang pertama dipangggil)
    public Bus(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 1;
    }

    // Method Mutator agar penumpang bertambah
    public void addPenumpang(double penumpang) {
        // operasi penjumlahan
        this.penumpangBaru = this.penumpang + penumpang;
        // Seleksi kondisi
        if (this.penumpangBaru >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = this.penumpangBaru;
            counter++; // counter akan menambah
        }
    }

    // method penumpang
    public void getPenumpang(int penumpang) {
        if (penumpang == 5) {
            System.out.println("Jumlah penumpang berjumlah " + penumpang);
        } else {
            System.out.println("Jumlah penumpang kurang dari 5 ");
        }
    }

    // method rata rata
    public double getAverage() {
        return this.penumpang / this.counter;
    }

    // method hasil
    public void cetakPenumpang() {
        System.out.println("\nPenumpang Bus Sekarang                  = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxPenumpang);
        System.out.println("Rata rata                                 = " + getAverage());
    }
}
