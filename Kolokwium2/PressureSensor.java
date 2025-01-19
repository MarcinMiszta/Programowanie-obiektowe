public class PressureSensor implements Sensor {
    private double Value;
    private String Status;

    @Override
    public double readValue() {
        return Value;
    }

    @Override
    public String getStatus() {
        return Status;
    }

    @Override
    public void reset() {
        this.Status = "Default";
    }
}
