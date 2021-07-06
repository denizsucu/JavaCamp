package interfaces;

public class CustomerManager {
    private Logger[] loggers; // bağımlı olduğumuz şeyin private değişkenii oluşturuyoruz

    public CustomerManager(Logger[] loggers) { // Parametresiz constructor çalışmaz artık
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Customer is added. " + customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());

    }
    public void delete(Customer customer){
        System.out.println("Customer is deleted. " + customer.getFirstName());


    }
}
