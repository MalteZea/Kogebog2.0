package sample;

public class IngrediensMedNaeringsDetaljer extends Ingrediens {
    int cVitamin;
    int magnesium;
    int kalk;

    public IngrediensMedNaeringsDetaljer(String navn, int kalorier, int cVitamin, int magnesium, int kalk) {
        super(navn, kalorier);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;
    }

    boolean godModForkølelse() {
        if (cVitamin > 5) {
            System.out.println(getNavn() + " er god mod forkølelse.");
            return true;
        } else {
            System.out.println(getNavn() + " er ikke god mod forkølelse.");
            return false;
        }
    }

}
