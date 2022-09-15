public class Car {
    public static void main(String[] args){
        Car car = new Car("Ferrari", "Red");
        System.out.println(car.getColour());
        Car car2 = new Car(car.getManufacturer(), car.getColour());
        System.out.println(car.getColour());
        System.out.println(System.identityHashCode(car));
        System.out.println(System.identityHashCode(car2));
        car = car2;
        System.out.println(System.identityHashCode(car));
    }

    private int maxSpeed;
    private boolean isAutomatic;
    private int totalWheels;
    private String manufacturer;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    private String colour;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public int getTotalWheels() {
        return totalWheels;
    }

    public void setTotalWheels(int totalWheels) {
        this.totalWheels = totalWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    public Car(){

    }

    public Car(String manufacturer, String colour){
        this.manufacturer = manufacturer;
        this.colour = colour;
    }
}
