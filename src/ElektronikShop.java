public class ElektronikShop  {

    public static int finde_billigste_tastatur(int[] tastaturen) {
        int billigste = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < billigste) {
                billigste = tastaturen[i];
            }
        }
        return billigste;
    }



}
