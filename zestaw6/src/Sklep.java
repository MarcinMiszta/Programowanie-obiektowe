import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkty = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }
    public void wyswietlOferty(){
        for (Produkt produkt : produkty) {
            System.out.println(produkt.nazwa);
        }
    }
    public Produkt wyszukajProduktu(String nazwa){
        for (Produkt produkt : produkty) {
            if (produkt.nazwa.equals(nazwa)) {
                return produkt;
            }
        }
        return null;
    }
    public void zakupy(KoszykZakupowy koszyk, Produkt produkt, int ilosc){
        koszyk.dodajProdukt(produkt, ilosc);
    }
    public Sklep() {}
}
