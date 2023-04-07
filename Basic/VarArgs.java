package Basic;

import java.util.Arrays;

public class VarArgs {
    public static void main (String [] args) {
        fun(2,3,23, 56, 678, 6,89);
        multiple(2,3, "rahul", "esr","rewtyarg");
    }

    static void multiple(int a, int b, String ...v) // varArgs always at the end else how will know when it going to end
    {

    }
    static void fun (int ...v) // array of int
    {
        System.out.println(Arrays.toString(v));
    }
}
