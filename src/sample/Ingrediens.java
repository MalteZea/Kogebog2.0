package sample;

public class Ingrediens {
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

    Ingrediens(String navn, int kalorie){
        this.navn = navn;
        this.kalorie = kalorie;
        System.out.println("Ingrediens er oprettet: " + navn);
    }
}
