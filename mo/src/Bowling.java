public class Bowling {

    int guritasSzam = 0;

    public int mezoSzam() {
        return 10 - guritasSzam;
    }

    int[] ertekek = new int[12];
    boolean[] isSpare = new boolean[10];
    boolean[] isStrike = new boolean[10];


    public int mezoErteke(int guritas1, int guritas2) {

        if (guritas1 == 10){
            strike(guritas1, guritas2);
            isStrike[guritasSzam] = true;
        }
        else if (guritas1 + guritas2 == 10){
            spare(guritas1, guritas2);
            isSpare[guritasSzam] = true;
        }

        guritasSzam++;
        return ertekek[guritasSzam-1] = guritas1 + guritas2;
    }

    public String spare(int guritas1, int guritas2) {
        if (guritas1 + guritas2 == 10) return guritas1 + " /";

        return guritas1 + " " + guritas2;
    }

    public String strike(int guritas1, int guritas2) {
        if (guritas1 == 10) return "X";

        return guritas1 + " " + guritas2;
    }

    public int osszPont() {
        int osszPont = 0;

        for (int i = 0; i < 10; i++){
            if (isSpare[i]){
                osszPont += ertekek[i] + ertekek[i+1];
            }else if (isStrike[i]){
                osszPont += ertekek[i] + ertekek[i+1] + ertekek[i+2];
            }else{
                osszPont += ertekek[i];
            }
        }

        return osszPont;
    }
}
