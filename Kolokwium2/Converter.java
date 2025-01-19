public interface Converter {
    public double convertToEuro(double amount);
    public double convertToUSD(double amount);
    public double getConversionRate(String currency);

}
