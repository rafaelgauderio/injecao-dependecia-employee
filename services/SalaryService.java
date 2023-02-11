package services;

import entities.Employee;

public class SalaryService {

    // modelo errado de fazer
    // isso faz ter uma acoplação forte de dependência
    PensionService pensionService = new PensionService();
    TaxService taxService = new TaxService();

    // salário líquido
    public double netSalary (Employee employee) {

        // salário líquido = salário líquido - imposto - previdência
        return employee.getGrossSalary()- taxService.tax(employee.getGrossSalary()) - pensionService.pensionDiscount(employee.getGrossSalary());


    }

}
