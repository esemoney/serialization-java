
package objectSerialization;

import java.io.Serializable;

/**
 *
 * @author efeko
 */
public class Car implements  Serializable{
    
    private  String make;
    private  String model;
    private int noOfWheels;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public Car(String make, String model, int noOfWheels) {
        this.make = make;
        this.model = model;
        this.noOfWheels = noOfWheels;
    }
    
    public String toString()
    {
        return String.format("%s %s No of Wheels:  %d", make, model, noOfWheels);
    }
}
