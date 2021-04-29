package objectSerialization;

import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.nio.file.Path;

/**
 * @author efeko
 */
import java.nio.file.Files;
public class SerializedObject {
    
    public static void main(String[] args) 
    {
        Car myCar = new Car("Keke", "Napep", 2015);
        
        Path file = Paths.get("Car.ser");
        
        try 
        {
            ObjectOutputStream outputStream = 
                new ObjectOutputStream(Files.newOutputStream(file));
            
            outputStream.writeObject(myCar);
            outputStream.close();
            
            System.err.println("Write Successful");
        } 
        catch (Exception e) 
        {
            System.out.println("AN error occured "+ e);
        }
    }
}
