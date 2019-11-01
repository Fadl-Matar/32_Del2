package FieldGame;

import java.util.Scanner;

public class Game {
    private Spiller spiller1;
    private Spiller spiller2;
    private Scanner scanner = new Scanner(System.in);

    public Game() {
        spiller1 = new Spiller();
        spiller2 = new Spiller();
    }

    public void spilIntro() {
        System.out.println("Velkommen til spillet");
    }

    public void getSpillerNavne() {
        System.out.println("Spiller 1, indtast venligst dit navn");
        String spiller1Navn = scanner.nextLine();
        spiller1.setNavn(spiller1Navn);

        System.out.println("Spiller 2, indtast venligst dit navn");
        String spiller2Navn = scanner.nextLine();
        spiller2.setNavn(spiller2Navn);

    }
    public void spillerTur() {
        while(spiller1.isInGame() && spiller2.isInGame()) {
            spiller1.kastTerninger();
            spiller2.kastTerninger();
        }
    }

    public void spilSlut() {
        System.out.println("Spillet er slut");
        System.out.println(spiller1.getNavn() + " fik " + spiller1.getKonto().getBeløb());
        System.out.println(spiller2.getNavn() + " fik " + spiller2.getKonto().getBeløb());

        if (spiller1.getKonto().getBeløb() > spiller2.getKonto().getBeløb()) {
            System.out.println(spiller1.getNavn() + " har vundet");
        } else {
            System.out.println(spiller2.getNavn() + " har vundet");
        }
    }
}
