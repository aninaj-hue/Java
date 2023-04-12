package car;

public class Car {
    protected int Speed;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
    public void start()
    {
        System.out.println("Masina e pornita");
    }

    public void accelerate()
    {
        System.out.println("Masina accelereaza");
    }
    public void stop()
    {
        System.out.println("Masina e oprita!");
    }
    public void startEngine()
    {
        System.out.println("Motorul e pornit");
    }

    public void stopEngine()
    {
        System.out.println("Motorul e oprit");
    }
}
