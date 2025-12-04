// Parent class
class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

class Cat extends Animal{
	void meow(){
		System.out.println("I can meow");
	}
}

// Main class
class InheritanceDemo{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
		
		Cat c = new Cat();
		c.eat();
		c.meow();
    }
}
