package Enkapsulasi.TugasPraktikum.No1;

class UjiBus {
    public static void main(String[] args) {
        // Membuat object maxPenumpang
        Bus bus = new Bus(5);

        // Nilai param penumpang
        bus.getPenumpang(1);
        bus.getPenumpang(5);

        bus.cetakPenumpang();

        bus.addPenumpang(1); // Menambbah 1 penumpang
        bus.cetakPenumpang();

        bus.addPenumpang(2); // Menambbah 2 penumpang
        bus.cetakPenumpang();

        bus.addPenumpang(3); // Menambbah 3 penumpang
        bus.cetakPenumpang();
    }
}
