import java.util.Scanner;

public class Konto {

    private int beløb;

    public Konto() {
        this.beløb = 1000;
    }
    public int getBeløb() {
        return beløb;
    }
    public void indsæt(int indsætBeløb) {
        beløb += indsætBeløb;
    }
    public void træk(int trækBeløb) {
        if (beløb - trækBeløb < 0) {
            System.out.println("Beløb på " + beløb + " transaktion kan ikke gennemføres");
        } else {
            beløb -= trækBeløb;
        }
    }
}
