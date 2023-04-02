public class WrapperClasses {

    public static void main(String[] args) {
        // int a = 10;

        // wrapper class
        Integer num = 45; // created as an object

        // int a = 10;
        // int b = 34;

        // swap(a, b);

        Integer a = 10;
        Integer b = 34;

        // passed bt reference value not reference
        swap(a, b);
        // still it will not swap

        // it wont swap coz in java, pass by value
        System.out.println(a + " " + b);

        final int bonus = 2;
        // bonus = 8;

        final A kunal = new A("kunal");
        A newkunal = new A("new Kunal");

        kunal.name = "kushwaha";

        // when a non primitive is final, you cannot reassign it
        //kunal = newkunal; // error

        A obj;
        for(int i = 0; i < 1000000000; i++) {
            obj = new A("random name");

            // obj.finalize(); we cant do it manually, automatically it is called
        }

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

// wrapper class--> using primitive as an object

class A {
    final int num = 10;
    String name;

    A(String name) {
        System.out.println("obejct created");
        this.name = name;
    }

    // finalize garbage collector
    protected void finalize() {
        System.out.println("object is destroyed");
    }
}