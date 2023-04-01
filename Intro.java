import java.util.Arrays;

public class Intro {

    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 nums
        String[] nums = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // store in single intity --> class
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        // creating object of the class
        //just declaring
        Student s1; // declare ref. variable to an obejct ---> error not initialised
        
        // initialised 
        s1 = new Student(); 
        System.out.println(s1); // some random value output
        System.out.println(s1.rno); // 0
        System.out.println(s1.marks); // 0.0

        s1.rno = 20; // rno inside s1 object
        s1.name = "kunal";
        s1.marks = 45;

        
        System.out.println(s1.rno); 
        System.out.println(s1.name);
        System.out.println(s1.marks); 
    }

}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;
}
