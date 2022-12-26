package Java;

public class Car {
    int id;
    private int passengers;
    String license;
    Account driver;
    

    public Car(String license, Account driver){
        this.license=license;
        this.driver=driver;
    
        
    }

    public void printDataCar(){
        if( passengers != 0){
            System.out.println("License: "+license +
            "\n Driver Name: "+ driver.name +" Passangers " +passengers);
        }
    }
   
    public int getPassengers() {
        return passengers;
    }
    
    public void setPassengers(int passengers) {
        if(passengers==4){
            this.passengers = passengers;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros ");
        }
        
        
    }
}
    
 
    

