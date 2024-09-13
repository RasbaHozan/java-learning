package training.oop.problems;

//Abstract Base Class
abstract class Vehicle {
// Properties
String make;
String model;
int year;

// Constructor
public Vehicle(String make, String model, int year) {
   this.make = make;
   this.model = model;
   this.year = year;
}

// Abstract method to calculate rental cost
public abstract double calculateRentalCost(int days);

//method to display vehicle information
public void displayInfo() {
   System.out.println("Make: " + make);
   System.out.println("Model: " + model);
   System.out.println("Year: " + year);
}
}

//Subclass Car
class Car extends Vehicle {
// Property
boolean isLuxury;

// Constructor
public Car(String make, String model, int year, boolean isLuxury) {
   super(make, model, year);
   this.isLuxury = isLuxury;
}

// Override method to calculate rental cost
public double calculateRentalCost(int days) {
	    double baseRate = 5000; 
	    double chargeLuxury;
	    if (isLuxury) {
	        chargeLuxury = 2500;
	    } else {
	        chargeLuxury = 0;
	    }

	    return baseRate * days + chargeLuxury * days;
	}

// Override displayInfo to include luxury status
public void displayInfo() {
	    super.displayInfo();
	    if (isLuxury) {
	        System.out.println("Luxury: Yes");
	    } else {
	        System.out.println("Luxury: No");
	    }
	}
}

//Subclass Truck
class Truck extends Vehicle {
// Property
double loadCapacity;

// Constructor
public Truck(String make, String model, int year, double loadCapacity) {
   super(make, model, year);
   this.loadCapacity = loadCapacity;
}

// Override method to calculate rental cost
public double calculateRentalCost(int days) {
   double baseRate = 10000.0;
   double capacityCharge = loadCapacity * 5000.0;
   return baseRate * days + capacityCharge;
}

// Override displayInfo to include load capacity
public void displayInfo() {
   super.displayInfo();
   System.out.println("Load Capacity: " + loadCapacity + " tons");
}
}

//Test Class
class VehicleTest {
public static void main(String[] args) {
   // Array of Vehicle objects
   Vehicle[] fleet = {
new Car ("Toyota", "Corolla", 2020, true),
new Car("Suzuki", "Alto", 2018, false),
new Truck("Nissan", "Titan", 2021, 5.0),
new Truck("Toyota", "Hilux", 2019, 7.5),
   };
   // Iterate through the array
   for (Vehicle vehicle : fleet) {
  	 
  	 //displaying information and rental cost for each vehicle
       vehicle.displayInfo();
       System.out.println("Rental Cost for 3 days: Rs." + vehicle.calculateRentalCost(5));
       
   }
}
}
