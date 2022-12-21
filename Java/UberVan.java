package Java;
import java.util.ArrayList;
import java.util.Map;

    

public class UberVan extends Car {

    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public UberVan(String license,String driver,Map<String,Map<String,Integer>>typeCarAccepted,ArrayList<String> seatsMaterial){
        super(license, null);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;

    }

    
    
}
