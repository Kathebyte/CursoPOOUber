package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola Futura programadora");
        
        Car car = new Car("AKB123", new Account("Jhon Edison Munoz", "1040745854"));
        car.passengers=4;
        car.printDataCar();


        Car car2 = new Car("KBM154", new Account("Alezander Molina", "12345562"));
        car2.passengers=4;
        car2.printDataCar();

    }
}