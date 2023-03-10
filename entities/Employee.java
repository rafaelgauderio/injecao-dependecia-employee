package entities;

public class Employee {

    private String name;
    private double grossSalary;

    public Employee () {

    }
    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    /* não pode setar direto o salário líquido. Tem que ser calculado atráves dos serviços
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    */

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", grossSalary=" + String.format("r$ %.2f",grossSalary) +
                '}';
    }
}
