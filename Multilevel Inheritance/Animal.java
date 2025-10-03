class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal can walk");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
