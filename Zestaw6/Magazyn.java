import java.util.*;

public class Magazyn {
    Map<Produkt, Integer>produkty;

    public void dodajProduktDoMagazynu(Produkt p, int i) {
        produkty.put(p, i);
    }
    public void usunZMagazynu(Produkt p, int i) {
        produkty.put(p, produkty.get(p) - i);
    }
    public void wyswietlMagazyn(){
        for(Produkt p : produkty.keySet()){
            System.out.println(p.nazwa+" w ilości: "+ produkty.get(p));
        }
    }


    public Magazyn() {
        produkty = new HashMap<>();

    }
}
