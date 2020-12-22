package sample;

import java.util.ArrayList;

public class Opskrift {
    Opskrift(String navn) {
        this.navn = navn;
        System.out.println("Opskrift er oprettet: " + navn);
    }

    private String navn;
    private String fremgangsmåde;
    private int antalPortioner;
    private int tilberedningstid;
    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();

    public void addIngrediens(Ingrediens ingrediens) {
        this.ingredienser.add(ingrediens);
    }

    public void addIngrediens(String navn, int kalorier) {
        Ingrediens ingrediens = new Ingrediens(navn, kalorier);
        this.ingredienser.add(ingrediens);
    }


    public ArrayList<Ingrediens> getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(ArrayList<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmåde() {
        return fremgangsmåde;
    }

    public void setFremgangsmåde(String fremgangsmåde) {
        this.fremgangsmåde = fremgangsmåde;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public int getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }
}
