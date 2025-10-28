
public class Sale extends Deal{
    public Sale(String product, int summa) {
        super("Продажа " + product + " на " + summa + "руб.", 0, summa);
    }
}
