class Produkt{
    String nazwa;
    double cena;
    int iloscNaMagazynie;
    public String getNazwa(){
        return this.nazwa;
    }
    public double getCena(){
        return this.cena;
    }
    public int getIloscNaMagazynie(){
        return this.iloscNaMagazynie;
    }
    public void wyswietlInformacje(){
        System.out.println("Szczegóły produktu: ");
        System.out.printf("Nazwa: %s\n", getNazwa());
        System.out.printf("Cena: %f\n", getCena());
        System.out.printf("Ilość na magazynie: %d\n", getIloscNaMagazynie());
    }
    public void dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie += ilosc;
    }
    public void usunZMagazynu(int ilosc){
        if(this.iloscNaMagazynie-ilosc > 0){
        this.iloscNaMagazynie -= ilosc;
        }
    }
    public Produkt(String nazwa,double cena,int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
}
