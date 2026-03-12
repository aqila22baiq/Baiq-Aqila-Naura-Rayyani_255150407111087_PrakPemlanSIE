public class Mobil{
private String nopol;
private String warna;
private String merk;
private int kecepatan;
private double jaraktempuh;
public void setNopol(String n) {
nopol = n;
}
public void setWarna(String s) {
warna = s;
}
public void setMerk(String m) {
merk = m;
}
public void setKecepatan(int k) {
kecepatan = k;
}
public double hitungjaraktem(double waktu){
    jaraktempuh = kecepatan * waktu;
    return jaraktempuh;
}
public double kecepatanMeterpersekon(){
    return kecepatan * 1000 / 3600;
}
public void tampilkecepatanMPS(){
    System.out.println("Kecepatan mobil dalam meter per sekon adalah " + kecepatanMeterpersekon() + " m/s");
}
public void display() {
System.out.println("Mobil bermerk " + merk);
System.out.println("bernomor polisi " + nopol);
System.out.println("serta memililki warna " + warna);
System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
}
}