import java.util.Scanner;

public class Konto {
    private Spiller spillerscore = new Spiller();
    private int pengebeholdning;
    private boolean inGame = true;
    private Scanner scanner = new Scanner(System.in);

    public Konto(int pengebeholdning) {
        this.pengebeholdning = 1000;
    }

    public Konto() {
        spillerscore = new Spiller();
    }

    public boolean isInGame() {
        return inGame;
    }
    public int getPengebeholdning() {
        return pengebeholdning;

    }


}
