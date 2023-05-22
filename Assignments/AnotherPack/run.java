package Assignments.AnotherPack;
import javax.annotation.processing.SupportedOptions;

import Assignments.circle.*;

public class run {
    public static void main(String [] args) {

        Assignments.circle.Circle obj = new Assignments.circle.Circle();

        System.out.println(obj.area(45));
        System.out.println(obj.circumference(45));

    }
}
