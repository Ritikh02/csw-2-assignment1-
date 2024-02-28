/*Write a Java code snippet that comprises a Car class and a CarTester class. The Car class
should define private fields for make and model, along with a parameterized constructor and
getter/setter methods for these attributes. In the CarTester class, instantiate two instances of
the Car class: myCar1 with a specified make and model, and myCar2 with null values. After
instantiation, the CarTester class should retrieve and print the initial make and model of both
cars. Then, it should set new values for myCar2 using setter methods and print the updated
make and model. */

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class A1Q1 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Supra");
        Car myCar2 = new Car("Dodge", "Hellcat");
        System.out.println("Initial make and model of myCar1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
        myCar2.setMake("Koeingseggs");
        myCar2.setModel("Jesko");
        System.out.println("Updated make and model of myCar2: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}
