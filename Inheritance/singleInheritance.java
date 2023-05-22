package Inheritance;

public class singleInheritance {
    public static void main(String [] args){
        ankit r = new ankit();
        r.input();
        r.display();
    }
}

class student {
    int roll, marks;
    String name;

    void input(){
        System.out.println("enter roll, name and marks");
    }
}

class ankit extends student{
    void display() {
        roll = 1;
        name = "ankit";
        marks = 89;
        System.out.println(roll + " "+ name + " "+ marks);
    }

}
