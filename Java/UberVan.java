package Java;
import java.util.ArrayList;
import java.util.Map;

    

public class UberVan extends Car {

    Map<String,Map<String,Integer>>typeCarAccepted;
    ArrayList<String> seatsMaterial;
    private int passengers;

    public UberVan(String license,Account driver){
        super(license, driver);
    }


    public UberVan(String license,Account driver,
    Map<String,Map<String,Integer>>typeCarAccepted,ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted=typeCarAccepted;
        this.seatsMaterial=seatsMaterial;
    }

    
    @Override
    public void setPassengers(int passengers) {
        // TODO Auto-generated method stub
        if(passengers == 6){
            this.passengers=passengers;
        }else{
            System.out.println("Debes asignar 6");
        }


        
    }

    

    
    
}
