public class Expenditure extends Deal {
    public Expenditure(String product, int summa) {
        super("Покупка " + product + " на " + summa + "руб.",  summa, 0);
    }
}
