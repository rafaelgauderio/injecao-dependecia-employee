package application;

import entities.Employee;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        PensionService pensionService = new PensionService();
        TaxService taxService = new TaxService();
        Employee employee01 = new Employee("",10000);
        SalaryService salaryService = new SalaryService();

        employee01.setName("Rafael de Luca");

        System.out.println(pensionService.pensionDiscount(10000));
        System.out.println(taxService.tax(10000));

        // pensao 8%
        // imposto 15% 

        double netSalary = salaryService.netSalary(employee01);
        System.out.println("Salário líquido: " + String.format("r$ %.2f",netSalary));


        input.close();
    }
}