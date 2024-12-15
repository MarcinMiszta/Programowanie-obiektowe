public class KlientFirmowy extends Klient{
    String NIP;
    String REGON;

    public KlientFirmowy(String imie, String nazwisko, String NIP, String REGON){
        super(imie, nazwisko);
        NIP=NIP;
        REGON=REGON;

    }
}
