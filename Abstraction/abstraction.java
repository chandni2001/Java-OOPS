package Abstraction;

public class abstraction {
    
    public static void main(String[] args) {
        Dog a = new Dog(); // reference create 
        a.eat();
        

        Lion l = new Lion();
        l.eat();

        
    }
}


abstract class animal {

    animal() {
        System.out.println("all animals...");
    }
    public abstract void eat();
}

class Dog extends animal {

    Dog() {
        super();
    }
    public void eat(){
        System.out.println("slow");
    }
}

class Lion extends animal {

    Lion() {
        super();
    }
    public void eat(){
        System.out.println("fast");
    }
}
