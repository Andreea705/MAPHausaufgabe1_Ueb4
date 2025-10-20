//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[] tastaturen = {34,54,23,45};
    int[] usbLaufwerke = {17,54,23,34,78};

    Person markus = new Person("markus",50);
    ElektronikShop elektronikShop = new ElektronikShop();

    System.out.println("Billigste Tastatur: ");
    System.out.println(elektronikShop.finde_billigste_tastatur(tastaturen));
    System.out.println("Teuerster Gegenstand:");
    System.out.println(elektronikShop.finde_teuersten_gegenstand(tastaturen, usbLaufwerke));
    System.out.println("Teuerster USBLaufwerk in Markus' Budget: ");
    System.out.println(elektronikShop.finde_teuersten_usb_fuer_person(markus,usbLaufwerke));
    System.out.println("Teuerste Tastatur+USBLaufwerk in Markus' Budget: ");
    System.out.println(elektronikShop.maximale_spende_der_person(markus,usbLaufwerke,tastaturen));
}
