package Encapsulation;

public class encapsulation {
    
    public static void main() {
        A a = new A();
        
        a.setValue(34);

        a.getValue();
    }
}

class A {
    private int value; // data hiding

    public void setValue(int value) { // data abstaction
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
