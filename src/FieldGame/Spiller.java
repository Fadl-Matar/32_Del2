package FieldGame;


import java.util.Scanner;

public class Spiller {

        private String navn;
        private int kastetØjneVærdi;
        Scanner scanner = new Scanner(System.in);
        private Terning terning = new Terning(1);
        private boolean inGame = true;
        private Konto konto = new Konto();

        public Spiller() {
            this.kastetØjneVærdi = 0;
        }

        public Konto getKonto() {
            return konto;
        }

        public boolean isInGame() {
            return inGame;
        }

        public String getNavn() {
            return navn;
        }

        public void setNavn(String navn) {
            this.navn = navn;
        }

        public void kastTerninger() {
            System.out.println("\n\n");

            System.out.println(navn + ", tryk ENTER for at slå med terningerne");
            scanner.nextLine();

            int terningsVærdi1 = terning.roll();
            int terningsVærdi2 = terning.roll();

            kastetØjneVærdi = terningsVærdi1 + terningsVærdi2;
            System.out.println(navn + " du har slået en " + terningsVærdi1 + "'er og en " +
                    terningsVærdi2 + "'er, og har fået en antal øjneværdi på " + kastetØjneVærdi);

            switch (kastetØjneVærdi) {
                case 2:
                    getKonto().indsæt(250);
                    System.out.println("Tower + 250, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 3:
                    getKonto().træk(100);
                    System.out.println("Crater - 100, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 4:
                    getKonto().indsæt(100);
                    System.out.println("Palace Gates + 100, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 5:
                    getKonto().træk(20);
                    System.out.println("Cold Desert - 20, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 6:
                    getKonto().indsæt(180);
                    System.out.println("Walled City + 180, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 7:
                    getKonto().indsæt(0);
                    System.out.println("Monastery + 0, og har stadig nu et beløb på " + getKonto().getBeløb());
                    break;
                case 8:
                    getKonto().træk(70);
                    System.out.println("Black cave - 70, og har nu et beløb på = " + getKonto().getBeløb());
                    break;
                case 9:
                    getKonto().indsæt(60);
                    System.out.println("Huts in the mountain + 60, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 10:
                    getKonto().træk(80);
                    System.out.println("The Werewall - 80, og har nu et beløb på " + getKonto().getBeløb());
                    kastTerninger();
                    break;
                case 11:
                    getKonto().træk(50);
                    System.out.println("The pit - 50, og har nu et beløb på " + getKonto().getBeløb());
                    break;
                case 12:
                    getKonto().indsæt(650);
                    System.out.println("Goldmine + 650, og har nu et beløb på " + getKonto().getBeløb());
                    break;
            }
            if (getKonto().getBeløb() >= 3000) {
                inGame = false;
            }
        }
    }