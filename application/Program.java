package application;

import entities.Employee;
import services.PensionService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        PensionService pensionService = new PensionService();
        TaxService taxService = new TaxService();
        Employee employee01 = new Employee();
        employee01.setName("Rafael de Luca");

        System.out.println(pensionService.pensionDiscount(10000));
        System.out.println(taxService.tax(10000));
        System.out.println(employee01);










        input.close();
    }
}