package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        /*System.out.println("Velkommen til min opskrifts-applikations-dummy");
        blankLine();
        Opskrift glasurOpskrift = new Opskrift("Glasur");
        glasurOpskrift.addIngrediens("Flormelis", 389);
        glasurOpskrift.addIngrediens("Vand", 0);
        blankLine();
        Opskrift teOpskrift = new Opskrift("Te");
        teOpskrift.addIngrediens("Tebrev", 0);
        teOpskrift.addIngrediens("Vand", 0);
        teOpskrift.addIngrediens("Citron", 29); */

        Ingrediens sukker = new Ingrediens("Sukker", 400);
        Ingrediens citron = new Ingrediens("Citron", 29);
        sukker.rigPaaKalorier();
        blankLine();
        citron.rigPaaKalorier();

    }

    public static void blankLine() {
        System.out.println("");
    }

    ;
}
