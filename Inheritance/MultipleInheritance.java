package Inheritance;

public class MultipleInheritance  {
    
    public static void main(String [] args){
        base3 c = new base3();
        c.show();
    }
}

interface base {
    abstract void show();
}

interface base2{
    abstract void show() ;
}

class base3 implements base, base2 {
    public void show() {
        System.out.println("Interface A and B");
    } 
}
