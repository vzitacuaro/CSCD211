package model;

public class Employee extends Person {
    private String name;
    private String w2;
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.w2 = "Taxes";
        this.salary = salary;
    }

    public void generatew2() {
        System.out.println(" Generating W2");
        this.w2 = ("1098 form for the current year");
    }
}
