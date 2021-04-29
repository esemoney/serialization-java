package objectSerialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author efeko
 */
public class DeserializedObject 
{
    public static void main(String[] args)
    {
        Path file = Paths.get("car.ser");
        
        try 
        {
            
            ObjectInputStream inputStream = 
                    new ObjectInputStream(Files.newInputStream(file));
            
            Car myCar = (Car) inputStream.readObject();
            
            System.err.println("myCar");
            
        } 
        catch (IOException e) 
        {
            System.out.println("An error was found "+ e);
        }
        
        catch(ClassNotFoundException e)
        {
            System.out.println("An error was found " + e);
        }
    }
}
