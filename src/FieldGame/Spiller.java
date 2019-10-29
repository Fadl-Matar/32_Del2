package FieldGame;


import java.util.Scanner;

public class Spiller {

    private String navn;
    private int score;
    private Scanner scanner = new Scanner(System.in);
    private Terning terning = new Terning(1);

    public Spiller(int score) {
        this.score = 0;
    }

    public Spiller() {

    }

    public String getNavn() {
        return navn;
    }

    public int getScore() {
        return score;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void skiftTur() {
        System.out.println("\n\n");

        System.out.println(navn + ", tryk ENTER for at slå med terningerne");
        scanner.nextLine();

        int terningsVærdi1 = terning.roll();
        int terningsVærdi2 = terning.roll();

        score = terningsVærdi1+terningsVærdi2;
        System.out.println(navn + " du har slået en" + terningsVærdi1 + "'er og en " +
                terningsVærdi2 + "'er, og har fået en antal øjneværdi på " + (terningsVærdi1+terningsVærdi2));
    }
}
