
public class Vehicle implements Movable {
    private String color;
    private int capacity;
    private String licensePlateNo;
    private String year;
    private String model;
    private String make;
    private Boolean started;
    private Boolean wiperSwipe;


    public Vehicle() {
    }

    public Vehicle(String color, int capacity, String licensePlateNo, String year, String model, String make) {
        this.color = color;
        this.capacity = capacity;
        this.licensePlateNo = licensePlateNo;
        this.year = year;
        this.model = model;
        this.make = make;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getLicensePlateNo() {
        return licensePlateNo;
    }
    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    
    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", capacity=" + capacity + ", licensePlateNo=" + licensePlateNo + ", year="
                + year + ", model=" + model + ", make=" + make + "]";
    }
    //auto generated getter and setter for started: 
    // public Boolean getStarted() {
    //     return started;
    // }

    // public void setStarted(Boolean started) {
    //     this.started = started;
    // }

    //right click "source action" to let the App autogenerate getter, setters and constructors
    //override default: "source action" > "to string"

    public void start() { //manual getter of started
        this.started = true;

    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Boolean getWiperSwipe() {
        return wiperSwipe;
    }

    public void setWiperSwipe(Boolean wiperSwipe) {
        this.wiperSwipe = wiperSwipe;
    }

    public void stop() {
        this.started = false;
    }

    public void honk () {
        System.out.println("Beep...Beep...");

    }
//put all the functions all the sub class can do in the parent class
//child class can override the function in the parent class

    public void swipe(){
        this.wiperSwipe = true;

    }

    public void stopSwipe(){
        this.wiperSwipe = false;
        
    }

@Override   
public void moveRight() {
    System.out.println("Car is moving right.");

}

@Override   
public void moveLeft() {
    System.out.println("Car is moving left.");

}

@Override   
public void moveForward() {
    System.out.println("Car is moving forward.");

}

@Override   
public void moveBackward() {
    System.out.println("Car is moving backward.");

}

}

Container<Vehicle> container = new Container<>();
Container.addItem(schoolBus);
Container.addItem(savante);
Container.addItem(honda);

//retrieve data
List<Vehicle> retrieveVehicles = Container.getItems();
for (Vehicle vehicle : retrieveVehicles) {
    System.out.println(vehicle.toString());
}

