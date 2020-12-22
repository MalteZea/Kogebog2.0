package sample;

import java.util.ArrayList;

public class Opskrift {
private Opskrift(){
    System.out.println("Opskrift er oprettet");
}

    private String navn;
    private String fremgangsmåde;
    private int antalPortioner;
    private int tilberedningstid;
    ArrayList<Ingrediens> ingredienser;
}
