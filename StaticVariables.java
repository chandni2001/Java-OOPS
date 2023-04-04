public class StaticVariables {
    public  void main(String[] args) {

        // Human ram = new Human("ram");
        // Human shyam = new Human("shyam");

        // System.out.println(ram.population);
        // System.out.println(shyam.population);
        System.out.println(Human.population);

        // without reference and withour creating any object it will work
        System.out.println(Human.population);


        greet();

    }
    void fun2() {
        greet();
    }
    // this is not dependent on objects
    static void fun(){
       // greet(); // we cannt use this coz it requires an instance 
        // bu the function you are using it in does not depend on isntance

        // you cannot access non static stuff without referencing their instances in a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greet();
    }

    // we know that something which is not static, belongs to an object
    void greet() {
        fun(); // static inside non-static is possible
        System.out.println("Hello world!");
    }
}
