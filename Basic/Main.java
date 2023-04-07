package Basic;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        
        // system is a class 
        System.out.println("Hello World");
        // out is of type print stream. by default value is command line 
    
        // out = file // print file input

        // scanner -- class that allows us to take input

        Scanner scn = new Scanner(System.in); // ()  constructor -> from where taking input
        // sys.in --> means from keyboard, file - possible
        System.out.println(scn.nextInt()); // nextInt is also in scanner class
        
        // scn.next() -> string of length 1
        // nextLine

        float marks = scn.nextFloat();
        System.out.println(marks); // 10 --> 10.0 output(typecasting)
    
        
    }

}
