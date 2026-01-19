import java.util.ArrayList;

public class Bus extends Car {

    public Bus(String typeName) {
        super(typeName); // call Car constructor
    }

    //New methods for passengerEnter and passengerExit
    public void passengerEnter(ArrayList<String> passengers, String passengerName) {
        passengers.add(passengerName);
    }
    public void passengerExit(ArrayList<String> passengers, String passengerName) {
        passengers.remove(passengerName);
    }
   
}