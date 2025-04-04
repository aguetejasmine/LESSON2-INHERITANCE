public class Employee {

    private String name;
    private int age;
    protected double salary;

    //constructor
    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //method for getting name
    public String getName() {
        return this.name;
    }

    //method for getting age
    public int getAge() {
        return this.age;
    }

    //method for getting salary
    public double getSalary() {
        return this.salary;
    }

    //method for increasing salary
    public void raiseSalary() {
        this.salary = this.salary * 1.2;
    } 
    
    public static void main (String[] args) {
        Employee emp = new Employee ("JuanDelaCruz", 30, 1000000);
        System.out.println("Name:" + emp.getName());
        System.out.println("Age:" + emp.getAge());
        System.out.println("Salary:" + emp.getSalary());
    
        emp.raiseSalary();
        System.out.println("New Salary after raise:" + emp.getSalary());
    }
}