import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Car avante = new Car("White", 1599, "SN5655R","2019","Avante","Hyundai","Sedan" );
        avante.honk();

        Vehicle honda = new Car("Grey", 1600, "SNP4233M","2020","Civic","Honda","Hatchback");
        honda.honk();


        Bus schoolBus = new Bus("Yellow", 2000, "PA2155", "2015", "Tiagra", "Mercedes", true, true);


        schoolBus.stop();
        schoolBus.setDoorStatus("Open");
        

        List<Vehicle> vehicle = new ArrayList<>();
        vehicle.add(avante);
        vehicle.add(honda);
        vehicle.add(schoolBus); 

        for (Vehicle veh: vehicle) {
            veh.toString();
            
        }

        
    }
}
