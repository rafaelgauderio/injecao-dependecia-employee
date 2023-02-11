package services;

import entities.Employee;

public class SalaryService {

    // modelo errado de fazer
    // isso faz ter uma acoplação forte de dependência instancio o objeto direto na classe
    //PensionService pensionService = new PensionService();
    //TaxService taxService = new TaxService();

    private TaxService taxService;
    private PensionService pensionService;

    // inversão de controle e injeção de dependência com um construtor
    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService= taxService;
        this.pensionService = pensionService;
    }

    // salário líquido
    public double netSalary (Employee employee) {

        // salário líquido = salário líquido - imposto - previdência
        return employee.getGrossSalary()- taxService.tax(employee.getGrossSalary()) - pensionService.pensionDiscount(employee.getGrossSalary());
    }
}
