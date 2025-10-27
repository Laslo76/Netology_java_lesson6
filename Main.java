import taxes.USN15;
import taxes.USN6;


public class Main {
    public static void main(String[] args) {
        USN6 tax6 = new USN6();
        USN15 tax15 = new USN15();

        Deal[] transactios = {
                new Sale("Огурцы", 100_000),
                new Sale("Помидоры", 600_000),
                new Expenditure("Помидоры", 400_000)};

        Company companyOne = new Company("ООО Рога и копыта", tax15);
        System.out.println("В результате операций получена прибыль " + companyOne.applyDeals(transactios) + "руб.");
    }
}