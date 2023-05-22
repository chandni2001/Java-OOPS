package Inheritance;

public class MutilevelInheritance {
    public static void main(String [] args) {
        C c = new C();
        c.add();
        c.sub();
        c.mul();
        c.div();
        c.rem();
    }
}

class A {
    int a, b, c;
    void add() {
        a = 10;
        b = 20;
        System.out.println(a+b);
    }
    void sub() {
        a = 200;
        b = 100;
        System.out.println(a-b);
    }
}

class B extends A {
    void mul() {
        a = 10;
        b = 20;
        System.out.println(a*b);
    }
    void div() {
        a = 10;
        b = 20;
        System.out.println(a / b);
    }
}

class C extends B {
    void rem() {
        a = 10;
        b = 20;
        System.out.println(a % b);
    }
}