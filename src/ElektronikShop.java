public class ElektronikShop {

    public static int finde_billigste_tastatur(int[] tastaturen) {
        int billigste = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < billigste) {
                billigste = tastaturen[i];
            }
        }
        return billigste;
    }

    public static int finde_teuerste(int[] preise) {
        int teuerste = preise[0];

        for (int i = 1; i < preise.length; i++) {
            if (preise[i] > teuerste) {
                teuerste = preise[i];
            }
        }
        return teuerste;
    }


    public static int finde_teuersten_gegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int teuersteTastatur = finde_teuerste(tastaturen);
        int teuerstesUsb = finde_teuerste(usbLaufwerke);
        return Math.max(teuersteTastatur, teuerstesUsb);
    }

    public static int finde_teuersten_usb_fuer_person(Person person, int[] usbLaufwerkePreise) {
        int budget = person.getBudget();
        int teuerstesImBudget = -1;

        for (int preis : usbLaufwerkePreise) {
            if (preis <= budget && preis > teuerstesImBudget) {
                teuerstesImBudget = preis;
            }
        }
        return teuerstesImBudget;
    }

    public static int maximale_spende_der_person(Person person, int[] usbLaufwerke, int[] tastaturen) {
        int budget = person.getBudget();
        int maxSpende = -1;

        for (int usbPreis : usbLaufwerke) {
            for(int tastaturenPreis : tastaturen) {
                int total = usbPreis + tastaturenPreis;

                if(total < budget && total >maxSpende) {
                    maxSpende = total;
                }
            }
        }
        return maxSpende;
    }





}
