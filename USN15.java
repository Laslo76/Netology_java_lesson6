package taxes;

public class USN15 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        return Math.max((debit - credit) / 100 * 15, 0);
    }
}
