public class Expenditure extends Deal {
    public Expenditure(String product, int summa) {
        super("Покупка ",  summa, 0);
        comment += product + " на " + summa + "руб.";
    }
}
