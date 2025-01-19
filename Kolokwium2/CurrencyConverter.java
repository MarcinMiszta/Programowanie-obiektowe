import java.util.Objects;

public class CurrencyConverter implements Converter{
    double usd = 4;
    double euro = 4.2;

    public double getEuro() {
        return euro;
    }

    public double getUsd() {
        return usd;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    @Override
    public double convertToEuro(double amount) {
        return amount*euro;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount*usd;
    }

    @Override
    public double getConversionRate(String currency) {
        double arg=0;
        if(Objects.equals(currency, "euro")) arg = getEuro();
        if(Objects.equals(currency, "usd")) arg = getUsd();
        return arg;
    }
}
