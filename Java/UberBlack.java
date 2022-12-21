package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {

    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public UberBlack(String license,String driver,Map<String,Map<String,Integer>>typeCarAccepted,ArrayList<String> seatsMaterial){
        super(license, null);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;

    }

    
    
}
