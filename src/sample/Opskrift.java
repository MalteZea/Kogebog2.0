package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Opskrift implements KalorieBeregner, Serializable {
    Opskrift(String navn) {
        this.navn = navn;
        System.out.println("Opskrift er oprettet: " + navn);
    }

    private String navn;
    private String fremgangsmåde;
    private int antalPortioner;
    private int tilberedningstid;
    private ArrayList<Ingrediens> ingredienser = new ArrayList<>();

    public void visOpskrift() {
        visIngredienser();
        System.out.println("");
        visFremgangsmaade();
    }

    public void visIngredienser() {
        System.out.println("Du skal til " + navn.toLowerCase() + " bruge:");
        for (Ingrediens ingrediens : ingredienser) {
            System.out.println(" - " + ingrediens.getNavn());
        }
    }

    public void visFremgangsmaade() {
        if (navn.equals("Glasur")) {
            System.out.println("Opskriften for glasur: \n" +
                    "- Du blander flormelis og sukker, og smører det på kagen.");
        } else if (navn.equals("Te")) {
            System.out.println("Opskriften for te: \n" +
                    "- Put teen i kogende vand, vent 2 minutter og server.");
        } else return;

    }

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

    @Override
    public int kalorierIAlt() {
        int sum = 0;
        for (Ingrediens ingrediens : ingredienser) {
            sum += ingrediens.kalorierIAlt();
        }
        //System.out.println("Opskriften " + navn + " indeholder " + sum + " kalorier i alt");
        return sum;
    }

    int kalorierPerPortion() {
        int kaloriePerPortion = kalorierIAlt() / antalPortioner;
        System.out.println("Opskriften indeholder " + kalorierIAlt() + " kalorier i alt og " + kaloriePerPortion + " kalorier per portion.");
        return kaloriePerPortion;
    }

    //EKSEMPEL på opg. 15.
    public boolean erDerKoed(){
        for (Ingrediens ingrediens : ingredienser){
            if (ingrediens.diet.equals(Diet.KØD)){
                return true;
            }
        } return false;
    }
}
