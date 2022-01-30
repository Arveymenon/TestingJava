import Concepts.Abstraction.*;
// import Concepts.Interfacing.*;
import Concepts.Abstraction.Enums.Units;

public class entrypoint{

    public static void main(String[] args){

        System.out.println("Create Gaming PC");
        System.out.println(" ");

        CorsairX1 storage = new CorsairX1();
        storage.setName("Corsair Test").setSize(20, Units.GB, "SSD");
        
        storage.printDetails();
        // GamingPC pc = new GamingPC();
        // pc.getPC();
    }

}