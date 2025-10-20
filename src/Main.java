//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[] tastaturen = {34,54,23,45};
    int[] usbLaufwerke = {17,54,23,34,78};
    ElektronikShop elektronikShop = new ElektronikShop();

    System.out.println("Billigste Tastatur: ");
    System.out.println(elektronikShop.finde_billigste_tastatur(tastaturen));

}
