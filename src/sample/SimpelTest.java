package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        IngrediensMedNaeringsDetaljer pølse = new IngrediensMedNaeringsDetaljer("Pølse", 360, 3, 2, 3);
        IngrediensMedNaeringsDetaljer citron = new IngrediensMedNaeringsDetaljer("Citron", 29, 10, 4, 1);
        blankLine();
        pølse.godModForkølelse();
        blankLine();
        citron.godModForkølelse();

    }

    public static void blankLine() {
        System.out.println("");
    }

    ;
}
