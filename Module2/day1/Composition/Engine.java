package Module2.day1.Composition;

public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Engine with " + horsePower + " HP starts.");
    }
}
