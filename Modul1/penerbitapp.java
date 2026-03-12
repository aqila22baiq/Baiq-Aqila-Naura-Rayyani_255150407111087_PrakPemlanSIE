package konstruktor;

public class penerbitapp {
    public static void main(String[] args) {
        penerbit penerbit = new penerbit();
        penerbit.display();
        penerbit or = new penerbit("O'Reilly");
        or.display();
        penerbit gm = new penerbit("Gramedia", "Jakarta");
        gm.display();
    }
}
