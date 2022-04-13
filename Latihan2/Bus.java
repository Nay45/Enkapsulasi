package Enkapsulasi.Latihan2;

public class Bus {
    private int penumpang,maxpenumpang;

    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }

    //method mutator
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }

    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah = "+maxpenumpang);
    }
}
