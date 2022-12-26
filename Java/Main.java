package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola Futura programadora");
        
        UberX uberx = new UberX("AKB123", new Account("Jhon Edison Munoz", "1040745854"),"Ford","Escape");
        uberx.setPassengers(4);
        uberx.printDataCar();
        
       
        
    //    UberVan uberVan = new UberVan("KBW234", new Account("Jhon Edison Munoz", "1040745854"));
    //    uberVan.setPassengers(5);
    //    uberVan.printDataCar();


        /*Car car2 = new Car("KBM154", new Account("Alezander Molina", "12345562"));
        car2.passengers=4;
        car2.printDataCar();*/

    }
}