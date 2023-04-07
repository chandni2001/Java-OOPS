package Basic;

public class Function {
    public static void main (String [] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println(a + " " + b); // will print 10 , 20 only
        // not swapped value

        String name = " kunal kushwaha";
        changeName(name);
        System.out.println(name); // kunal... will be the output
    }

    static void changeName(String name) {
        name = "Rahul Rana";
    }

    static void swap(int a , int b) {
        int temp = a; 
        a = b;
        b = temp;
    }
}
