import java.util.Optional;

public class Adres {
    private String ulica;
    private int numerDomu;
    private Optional<Integer> numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public void pokaz(){
        System.out.println(kodPocztowy);
        System.out.println(miasto+", "+ulica+" "+numerDomu+" "+numerMieszkania);
    }

    public boolean przed(Adres adres, Adres adres2){
        if(adres.kodPocztowy.equals(adres2.kodPocztowy)){
            return true;
        }
        return false;
    }



    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, int numerMieszkania,String Miasto ,String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
        this.numerMieszkania = Optional.of(numerMieszkania);
    }

}
