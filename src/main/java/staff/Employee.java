package staff;

public abstract class Employee {

    String name;
    String niNumber;
    double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double increment){
        double newSalary = this.salary + increment;
        return newSalary;
    }

    public double payBonus(){
        double bonus = this.salary*0.01;
        return bonus;
    }
}

