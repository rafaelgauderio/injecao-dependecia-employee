package services;

public class BrazilTaxService extends TaxService {

    // imposto no Brazil é menor, 12%
    @Override
    public double tax(double amount) {
                return amount * 0.12;
        }



}
