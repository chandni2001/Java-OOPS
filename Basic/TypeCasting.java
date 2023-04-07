package Basic;
import java.util.*;


public class TypeCasting {
    
    public static void main(String [] args) {

        Scanner scn = new Scanner(System.in);
        float num = scn.nextFloat();
        System.out.println(num);

        // type casting
        int n = (int)(67.56f);
        System.out.println(num); // 67

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a;
        System.out.println(b); // 1 
        // byt max range - 256 // remainder of 257 % 256

        byte d = 40;
        byte e = 50;
        byte f = 100;
        int g = d * e / f; // 2000 how stored in byte 
        // result of the d * e easily exceeds the  range of byte operator
        // java automatically promoting it into int
        System.out.println(g);

        //byte a1 = 50;
        //b = b * 2; // value exceeds so how storing it into byte
        
        int nbr = 'A';
        System.out.println(nbr);

        // UNICODE Values
        System.out.println("नमस्ते");
        System.out.println("안녕하세요");
    }
}
