import java.util.Scanner;
public class App{
public static void main(String[] args) {
    Scanner thy = new Scanner(System.in);
//instansiasi objek bernama m1
Mobil m1 = new Mobil();
System.out.print("Masukkan merk mobil: ");
String merk = thy.nextLine();
System.out.print("Masukkan no polisi mobil: ");
String nopol = thy.nextLine();

m1.setKecepatan(50);
// m1.setMerk("Toyota");
// m1.setNopol("AB 1231 UA");
m1.setMerk(merk);
m1.setNopol(nopol);
m1.setWarna("Merah");
m1.display();
m1.tampilkecepatanMPS();
System.out.println("---------------");
//instansiasi objek bernama m2
Mobil m2 = new Mobil();
System.out.print("Masukkan merk mobil: ");
String merk2 = thy.nextLine();
System.out.print("Masukkan no polisi mobil: ");
String nopol2 = thy.nextLine();
m2.setKecepatan(100);
// m2.setMerk("Mitsubishi");
// m2.setNopol("N 1134 AG");
m2.setMerk(merk2);
m2.setNopol(nopol2);
m2.setWarna("Biru");
m2.display();
m2.tampilkecepatanMPS();
System.out.println("---------------");
System.out.println("Atribut pada objek m1 diubah.");
//mengubah warna dari objek m1
m1.setWarna("Hijau");
//menampilkan hasil perubahan
m1.display();
}
}