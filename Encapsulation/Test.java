// encapsulation --> wrapping of data in single unit called class
// have both data member and member fns()
package Encapsulation;


public class Test {
    
    public static void main (String [] args) {
        Employee e = new Employee("Shivam", 21);
        //System.out.println(e.empID);

        // use of static 
        System.out.println(Employee.empID);

        System.out.println(e.getPh());
        System.out.println(e.getName());
    }
}

// eg: 
// class Employee {
//     static int empID = 2;
//     int basicSal = 20000;
//     int incentive = 200;

//     void countSalaries() {
//         System.out.println(basicSal + incentive);
//     }
// }
