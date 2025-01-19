public class Car extends Vechicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(String brand, String model, int numberOfDoors){
        super(brand,model);
        this.numberOfDoors = numberOfDoors;
    }
}
