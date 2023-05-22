package Encapsulation;

class Employee {
    static int empID = 2;
    private int ph = 0;
    private String name;
    private int basicSal = 20000;
    private int incentive = 200;

    private void countSalaries() {
        System.out.println(basicSal + incentive);
    }

    Employee(String name, int ph){
        this.name = name;
        this.ph = ph;
    }

    // getter --> to get the data & setter --> to change

    int getph() {
        return ph;
    }

    String getName() {
        return name;
    }

    public char[] getPh() {
        return null;
    }

}