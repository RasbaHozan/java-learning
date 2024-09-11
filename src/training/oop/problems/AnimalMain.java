//Implement inheritance where a base class Animal has methods eat() and sleep().Create subclasses like Dog and Cat that inherit and extend these methods.

package training.oop.problems;
//Base class Animal
class Animal {
 private String name;

 // Constructor
 public Animal(String name) {
     this.name = name;
 }
 public String getName() {
     return name;
 }
 
 public void eat() {
     System.out.println(name + " is eating.");
 }
 public void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Subclass Dog extends Animal
class Dog extends Animal {
 private String color;

 // Constructor
 public Dog(String name, String color) {
     super(name); // Call to base class constructor
     this.color = color;
 }
 public void bark() {
     System.out.println(getName() + " is barking.");
 }
 public String getColor() {
     return color;
 }
}

//Subclass Cat extends Animal
class Cat extends Animal {
 private String color;

 // Constructor
 public Cat(String name, String color) {
     super(name); // Call to base class constructor
     this.color = color;
 }

 public void play() {
     System.out.println(getName() + " is playing.");
 }

 public String getColor() {
     return color;
 }
}

//Main class
class AnimalMain {
 public static void main(String[] args) {
     // Create an instance of Dog
     Dog myDog = new Dog("Sunny", "Golden");
     myDog.eat();  
     myDog.sleep(); 
     myDog.bark(); 

     // Create an instance of Cat
     Cat myCat = new Cat("Daisy", "White");
     myCat.eat();  
     myCat.sleep(); 
     myCat.play();  

  System.out.println(myDog.getName());
     System.out.println(myCat.getName());
 }
}
