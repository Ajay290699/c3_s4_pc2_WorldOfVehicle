package data;

public class IcEngine extends Engine {
    private int displacement;
    private int noOfCylinder;

    private String fuelType;

    public IcEngine(String modelNo, int power, int rpm, int displacement, int noOfCylinder, String fuelType) {
        super(modelNo, power, rpm);
        this.displacement = displacement;
        this.noOfCylinder = displacement;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    public void display() {
        display1();
        System.out.println("displacement = " + displacement);
        System.out.println("noOfCylinder = " + noOfCylinder);
        System.out.println("fuelType = " + fuelType);
    }
}
