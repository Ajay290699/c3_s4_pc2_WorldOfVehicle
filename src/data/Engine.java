package data;

public class Engine {
    private String modelNo;
    private int power;
    private int rpm;

    public Engine(String modelNo, int power, int rpm) {
        this.modelNo = modelNo;
        this.power = power;
        this.rpm = rpm;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void display1() {
        System.out.println("modelNo = " + modelNo);
        System.out.println("power = " + power);
        System.out.println("rpm = " + rpm);
    }
}
