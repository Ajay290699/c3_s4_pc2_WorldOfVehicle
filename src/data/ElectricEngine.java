package data;

public class ElectricEngine extends Engine {
    private int voltage;

    public ElectricEngine(String modelNo, int power, int rpm, int voltage) {
        super(modelNo, power, rpm);
        this.voltage = voltage;
    }

    public void display2() {
        display1();
        System.out.println("voltage = " + voltage);
    }
}
