package training.oop.problems;
class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getters & setters
    public String getMake() {
        return make;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
    
    public static void main(String[] args) {
    	
        // Instantiate Car objects
        Car car1 = new Car("Honda", "City", 2022);
        Car car2 = new Car("Toyota", "Corolla", 2023);
        Car car3 = new Car("Kia", "Sportage", 2024);

        // Access properties
        System.out.println(car1.getMake());
        System.out.println(car2.getModel()); 
        System.out.println(car3.getYear());  

        // Update year property
        car2.setYear(2024);
        System.out.println(car2.getYear()); 

        // Update car
        car1.setMake("Honda");
        car1.setModel("Civic");
        car1.setYear(2024);

        // Print car1 details
        System.out.println(car1);
    }
}