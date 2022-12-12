package transport;

import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1", "q1", 1.5);
        Competing car2 = new Car("car2", "q2", 2.5);
        Competing car3 = new Car("car3", "q3", 3.5);
        Competing car4 = new Car("car4", "q4", 4.5);

        Competing bus1 = new Bus("bus1", "w1", 5.5);
        Bus bus2 = new Bus("bus2", "w2", 6.5);
        Competing bus3 = new Bus("bus3", "w3", 7.5);
        Competing bus4 = new Bus("bus4", "w4", 8.5);

        Truck truck1 = new Truck("truck1", "r1", 10.5);
        Competing truck2 = new Truck("truck2", "r2", 11.5);
        Competing truck3 = new Truck("truck3", "r3", 12.5);
        Competing truck4 = new Truck("truck4", "r4", 13.5);

        DriverB driverB = new DriverB("DriverB", true, 4);
        DriverC driverC = new DriverC("DriverC", true, 6);
        DriverD driverD = new DriverD("DriverD", true, 8);

        driverB.startMove(car1);
        driverB.stopMove(car1);
        driverB.refill(car1);
        driverB.printInfo(car1);

        driverC.startMove(truck1);
        driverC.stopMove(truck1);
        driverC.refill(truck1);
        driverC.printInfo(truck1);

        driverD.startMove(bus2);
        driverD.stopMove(bus2);
        driverD.refill(bus2);
        driverD.printInfo(bus2);

    }
}
