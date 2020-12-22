package sample;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class SimpelTest implements Serializable {

    public static void main(String[] args) {
        //Eksempel på try catch
       /* Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);

        try {
            te.kalorierPerPortion();
        } catch (Exception e) {
            System.out.println("FEJL - opskriften " + te.getNavn() + " må ikke have 0 portioner");
        }
        te.setAntalPortioner(2);
        te.kalorierPerPortion();*/
    }

    public static void blankLine() {
        System.out.println("");
    }

    public void save() throws IOException {
        ArrayList<Opskrift> opskrifter = new ArrayList<>();
        Persistens persistens = new Persistens();
        Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);

        Opskrift glasur = new Opskrift("Glasur");
        glasur.addIngrediens("vand", 0);
        glasur.addIngrediens("Flormelis", 120);

        opskrifter.add(te);
        opskrifter.add(glasur);
        persistens.save(opskrifter);
    }

    public ArrayList<Opskrift> bootUp() throws IOException, ClassNotFoundException {
        ArrayList<Opskrift> opskrifter = new ArrayList<>();
        Persistens persistens = new Persistens();
        opskrifter = persistens.load();
        return opskrifter;
    }
}
