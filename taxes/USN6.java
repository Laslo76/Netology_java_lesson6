package taxes;

public class USN6 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit / 100 * 6;
    }
}
