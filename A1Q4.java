/*Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class
defines private fields model and price, alongside setter methods for each attribute.
Additionally, it overrides the toString() method to return a string representation of the laptop's
model and price. In the Main class, create an instance of Laptop, setting its model using the
setter method. Then, print the laptop object using the toString() method. Describe the
functionality of the toString() method in the Laptop class and explain how it is utilized in the
Main class */

class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop - Model: " + model + ", Price: $" + price;
    }
}

public class A1Q4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("Lenovo ThinkPad X1 Carbon");
        System.out.println(laptop.toString());
    }
}


/*The toString() method is overridden to return a string representation of the laptop's model and price.

In the A1Q4 class
An instance of the Laptop class is created.
The model of the laptop is set using the setModel() method.
The toString() method is called implicitly when printing the laptop object using System.out.println(). 
This method provides a string representation of the laptop's model and price, which is then printed to the console.
 */