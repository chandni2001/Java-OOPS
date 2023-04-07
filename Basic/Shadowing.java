package Basic;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); // 90

        //int x = 40; // the class variable at line 4 willbe shadowed by this
        int x;
        //System.out.println(x); // scope will begin when value is initialised

        x = 40;
        System.out.println(x); // 40
        // lower level overriding upper layer so higher level will shadowed
        fun();
    }

    static void fun () {
        System.out.println(x);
    }
}
