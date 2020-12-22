package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);
        blankLine();
        te.kalorierIAlt();
        blankLine();
    }

    public static void blankLine() {
        System.out.println("");
    }

    ;
}
