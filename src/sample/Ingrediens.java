package sample;

public class Ingrediens implements KalorieBeregner {
    private String navn;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorie() {
        return kalorie;
    }

    public void setKalorie(int kalorie) {
        this.kalorie = kalorie;
    }

    private int kalorie;
    Diet diet;

    Ingrediens(String navn, int kalorie) {
        this.navn = navn;
        this.kalorie = kalorie;
        System.out.println("Ingrediens er oprettet: " + navn);
    }

    public boolean rigPaaKalorier() {
        if (kalorie > 100) {
            System.out.println(navn + " er rig på kalorier.");
            return true;
        } else {
            System.out.println(navn + " er ikke rig på kalorier.");
            return false;
        }
    }

    @Override
    public int kalorierIAlt() {
        //System.out.println("Ingrediensen " + navn + " indeholder " + kalorie + " kalorier i alt");
        return kalorie;
    }
}
