package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrifts-applikations-dummy");
        blankLine();
        Opskrift glasurOpskrift = new Opskrift("Glasur");
        glasurOpskrift.addIngrediens("Flormelis", 389);
        glasurOpskrift.addIngrediens("Vand", 0);
        blankLine();
        Opskrift teOpskrift = new Opskrift("Te");
        teOpskrift.addIngrediens("Tebrev", 0);
        teOpskrift.addIngrediens("Vand", 0);
        teOpskrift.addIngrediens("Citron", 29);
        blankLine();
        glasurOpskrift.visOpskrift();
        blankLine();
        teOpskrift.visOpskrift();
        blankLine();

    }

    public static void blankLine() {
        System.out.println("");
    }

    ;
}
