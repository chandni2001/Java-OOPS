package Interface;

import java.util.Scanner;

public class Interface {
    public static void main(String [] args){
        client c = new Raju();
        c.input();
        c.output();
    }
}

interface client {
    void input(); // public + abstract
    void output();
}

class Raju implements client {

    String name; double sal;

    public void input() {
        Scanner scn = new Scanner(System.in);
        name = scn.nextLine();
        sal = scn.nextDouble();
    }

    public void output() {
        System.out.println(name);
        System.out.println(sal);
    }
}

