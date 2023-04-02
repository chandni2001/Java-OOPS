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
        // just declaring
        Student s1; // declare ref. variable to an obejct ---> error not initialised

        // initialised
        s1 = new Student();
        System.out.println(s1); // some random value output
        System.out.println(s1.rno); // 0
        System.out.println(s1.marks); // 0.0

        // s1.rno = 20; // rno inside s1 object
        // s1.name = "kunal";
        // s1.marks = 45;

        // System.out.println(s1.rno);
        // System.out.println(s1.name);
        // System.out.println(s1.marks);

        Student kunal = new Student();

        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);
        kunal.greeting();

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "something something";

        System.out.println(two.name);
    }

}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above properties
    // object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("hello my name is " + name);
    }

    // Student(){
    // this.rno = 13;
    // this.name = "kunal";
    // this.marks = 54;
    // }

    // constructor overloading default , parametrised
    Student( int rno, String name, float marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }

    // call a empty constructor inside another
    Student() {
        // this is how u call a constructor from another constructor
        // internally : new Student();

        this(13, " default person", 100.0f);
    }
}
