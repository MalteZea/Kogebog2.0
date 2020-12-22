package sample;

import static org.junit.jupiter.api.Assertions.*;

class OpskriftTest {
    @org.junit.jupiter.api.Test
    void kalorierIAlt() {
        Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);
        assertEquals(25, te.kalorierIAlt());
    }

    @org.junit.jupiter.api.Test
    void kalorierPerPortion() {
        Opskrift te = new Opskrift("Te");
        te.addIngrediens("Tebrev", 0);
        te.addIngrediens("Vand", 0);
        te.addIngrediens("Citron", 3);
        te.addIngrediens("Sukker", 22);
        te.setAntalPortioner(2);
        assertEquals(12, te.kalorierPerPortion());
    }
}