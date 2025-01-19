public class Vechicle {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public Vechicle(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
}
