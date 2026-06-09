package Module2.day1.Composition;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, int horsePower) {
        this.model = model;
        this.engine = new Engine(horsePower);
    }

    public void start() {
        System.out.println("Car " + model + " is starting.");
        engine.start();
    }
}
