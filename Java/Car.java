package Java;

public class Car {
    int id,passengers;
    String license;
    Account driver;
    

    public Car(String license, Account driver){
        this.license=license;
        this.driver=driver;
        
    }
    public void printDataCar(){
        System.out.println("License: "+license +
        "\n Driver Name: "+ driver.name);
    }
    
}
