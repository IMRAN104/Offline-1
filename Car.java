package Offline1;

/**
 * Created by EMON on 18-Sep-15.
 */
public class Car {
    private String name;
    private String manufacturer;
    private Driver driver;
    private int fuelCapacity;

    public Car(String name, String manufacturer, Driver driver, int fuelCapacity) {
        this.name = name;
        this.driver = driver;
        this.manufacturer = manufacturer;
        this.fuelCapacity = fuelCapacity;
    }

    public Car(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    Driver getDriver() {
        return driver;
    }

    String getManufacturer() {
        return manufacturer;
    }

    int getFuelCapacity() {
        return fuelCapacity;
    }


    void refuel(int miles) {
        fuelCapacity += miles;
    }

    void drive(int miles) {
        if (fuelCapacity >= miles) {
            fuelCapacity -= miles;
        } else {
            //cout << "Driving distance exceeds the car's fuel capacity!" << endl;
            System.out.println("Driving distance exceeds the car's fuel capacity!");
        }
    }

    void print() {
        //cout << name << " Manufacturer: " << manufacturer << " Driver: " << driver.getName() << " FuelCapacity: " << fuelCapacity << endl;
        System.out.println(name + " Manufacturer: "+manufacturer+ " Driver: "+driver.getName()+" FuelCapacity: "+fuelCapacity);
    }
}
