from car import Car
from account import Account

if __name__ == "__main__":
    print("FUTURA PROGRMADORA")
    
    car = Car()
    
    car.license="AKB123"
    car.driver="Jhon Edison Munoz"
    car.passengers=4
    print(vars(car))
    print(car.driver)
    print(car.license)

    