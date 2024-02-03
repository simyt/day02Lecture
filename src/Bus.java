public class Bus extends Vehicle {
    private Boolean frontDoor;
    private Boolean backDoor;
    private Boolean frontDoorOpened;
    private Boolean backDoorOpened;

    public Bus(Boolean frontDoor, Boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }
    public Bus(String color, int capacity, String licensePlateNo, String year, String model, String make,
            Boolean frontDoor, Boolean backDoor) {
        super(color, capacity, licensePlateNo, year, model, make);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
        this.frontDoorOpened = false;
        this.backDoorOpened = false;
    }
    //constructors for backDoorOpened and frontDoorOpened may not be needed and can be coded ltr
    //Getter and setters for backDoorOpened and frontDoorOpened must be generated
    public Boolean getFrontDoor() {
        return frontDoor;
    }
    public void setFrontDoor(Boolean frontDoor) {
        this.frontDoor = frontDoor;
    }
    public Boolean getBackDoor() {
        return backDoor;
    }
    public void setBackDoor(Boolean backDoor) {
        this.backDoor = backDoor;
    }
    public Boolean getFrontDoorOpened() {
        return frontDoorOpened;
    }
    // public void setFrontDoorOpened(Boolean frontDoorOpened) {
    //     this.frontDoorOpened = frontDoorOpened;
    // }
    public Boolean getBackDoorOpened() {
        return backDoorOpened;
    }
    // public void setBackDoorOpened(Boolean backDoorOpened) {
    //     this.backDoorOpened = backDoorOpened;
    // }

    //front or back door
    public void setDoorStatus(String door) {
        if (door.toLowerCase().equals("front")){
            if (frontDoor) {
                //open or close front door
                this.frontDoorOpened = !this.frontDoorOpened; //default is false.so not default is true
            } else {
                System.err.println( "There is no " + door + "door.");
            }

            if (backDoor){
                //either open or close back door
                this.backDoorOpened = !this.backDoorOpened;

            } 

        }
    }
    
    @Override
    public void honk() {
        System.out.println("Booo...Boo..."); //override the honk function in the vehicle class
    }
    public void getDoorStatus() {
        System.out.println("Front door: " + frontDoor + ", Opened:" + frontDoorOpened);
    }

}
