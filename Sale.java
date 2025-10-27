
public class Sale extends Deal{
    public Sale(String product, int summa) {
        super("Продажа ", 0, summa);
        comment = product + " на " + summa + "руб.";
    }
}
