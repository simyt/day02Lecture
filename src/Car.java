public class Car extends Vehicle {

    private String bodyType; //additional attribute unique to cars only
    

    public Car(String bodyType) { //car with attributes of vehicles
        this.bodyType = bodyType;
    }

    public Car(String color, int capacity, String licensePlateNo, String year, String model, String make,
            String bodyType) {
        super(color, capacity, licensePlateNo, year, model, make);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void honk() {
        System.out.println(this.getLicensePlateNo()+": Tuuu...Tuuu..."); //override the honk function in the vehicle class
    } //this.getLicensePlateNo. tells which car made the honk

    @Override
    public String toString() {
        return "Car [color=" + this.getColor() + ", capacity=" + this.getCapacity() + ", licensePlateNo=" + this.getLicensePlateNo() + ", year="
        + this.getYear() + ", model=" + this.getModel() + ", make=" + this.getMake() + ", bodyType=" + bodyType + "]";

    }

}
