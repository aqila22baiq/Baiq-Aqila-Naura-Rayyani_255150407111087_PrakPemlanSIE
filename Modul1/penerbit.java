package konstruktor;

public class penerbit{
    String nama;
    String kota = "Malang";
    penerbit() {
        this.nama = "Springer";
    }
    penerbit(String nama) {
        this.nama = nama;
    }
    penerbit(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }
    public void display() {
        System.out.println("Penerbit " + nama);
        System.out.println("di Kota " + kota);
    }
}
