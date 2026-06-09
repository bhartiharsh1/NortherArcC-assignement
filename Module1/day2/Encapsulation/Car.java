package Module1.day2.Encapsulation;

class Car {

    String brand;
    String modelName;
    int manufactureYear;
    String paintColor;


    public Car(String brand, String modelName, int manufactureYear, String paintColor) {
        this.brand = brand;
        this.modelName = modelName;
        this.manufactureYear = manufactureYear;
        this.paintColor = paintColor;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the " + brand + " " + modelName + ".");
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the " + brand + " " + modelName + ".");
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
        System.out.println("Year of Manufacture: " + manufactureYear);
        System.out.println("Color: " + paintColor);
    }
}
