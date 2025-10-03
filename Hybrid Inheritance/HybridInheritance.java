class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

interface Pet {
    void play();
}

class HybridCat extends Cat implements Pet {
    public void play() {
        System.out.println("HybridCat is playing like a pet");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        HybridCat hc = new HybridCat();
        hc.eat();
        hc.meow();
        hc.play();
    }
}
