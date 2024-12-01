
public class Main {
    public static void main(String[] args) {

        Produkt a = new Produkt("telefon",900,42);
        Produkt ac = new Produkt("telefon2",956,2);
        Produkt b = new Produkt("laptop",9000,4);
        KoszykZakupowy k = new KoszykZakupowy();
        k.dodajProdukt(a,5);
        k.dodajProdukt(ac,1);
        k.dodajProdukt(b,2);
        k.wyswietlZawartosckoszyka();
    }
}
