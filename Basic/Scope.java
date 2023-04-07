package Basic;

public class Scope {
    public static void main(String [] args) {

        int a = 10;
        int b = 20;

        {
            a = 34;
            int c = 33;
            // values initialised in this block, will remain in the block
        }

        System.out.println(c); // error

        System.out.println(num);
    }

    static void random(int mark) {
        int num = 67;
    }
}
