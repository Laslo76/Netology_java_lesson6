import taxes.TaxSystem;

public class Company {
    protected String title; // Наименование
    protected int debit; // Доходы
    protected int credit; // Расходы
    protected TaxSystem taxSystem; // Система налогообложения

    public Company(String name, TaxSystem taxSystem) {
        this.title = name;
        this.taxSystem = taxSystem;
    }

    protected void shiftMoney(int amount){
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    protected void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    protected void payTaxes() {
        int tax = this.taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n\n", title, tax);
        debit = 0;
        credit = 0;
    }

    protected void showStatus() {
        System.out.printf("Компания %s \n", title);
        System.out.printf("Доходы %d \n", debit);
        System.out.printf("Затраты %d \n", credit);
    }

    protected int applyDeals(Deal[] deals) {
        for (Deal deal: deals){
            debit += deal.debitChange;
            credit += deal.creditChange;
        }
        int difference = debit - credit;
        payTaxes();
        return difference;
    }
}
