import java.util.ArrayList;
import java.util.List;

public class KoszykZakupowy {
    private static class ProduktWKoszyku{
        Produkt produkt;
        int ilosc;

        public ProduktWKoszyku(Produkt produkt, int ilosc){
            this.produkt = produkt;
            this.ilosc = ilosc;
        }
        public double wartosc(){
            return produkt.getCena()*ilosc;
        }
        public void wyswietlInformacje(){
            System.out.println("nazwa: "+produkt.getNazwa()+" cena: "+produkt.getCena()+" ilosc: "+ilosc);
        }
    }

    private ArrayList<ProduktWKoszyku> listaProduktow = new ArrayList<>();

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.iloscNaMagazynie-ilosc>=0) {
            listaProduktow.add(new ProduktWKoszyku(produkt, ilosc));
            produkt.usunZMagazynu(ilosc);
        }
    }
    public void wyswietlZawartosckoszyka(){
        for(ProduktWKoszyku produkt : listaProduktow){
            produkt.wyswietlInformacje();
        }
    }
    public double obliczCalkowitaWartosc(){
        double wartosc = 0;
        for(ProduktWKoszyku ProduktWKoszyku : listaProduktow){
            wartosc += ProduktWKoszyku.wartosc();
        }
        return wartosc;
    }
    public KoszykZakupowy() {
        this.listaProduktow = new ArrayList<>();
    }
}
