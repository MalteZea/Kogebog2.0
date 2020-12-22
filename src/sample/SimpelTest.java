package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);

        try {
            te.kalorierPerPortion();
        }
        catch (Exception e) {
            System.out.println("FEJL - opskriften " + te.getNavn() + " må ikke have 0 portioner");
        }
        te.setAntalPortioner(2);
        te.kalorierPerPortion();
    }

    public static void blankLine() {
        System.out.println("");
    }

    ;
}
