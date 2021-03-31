import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulator extends Draw {
    
    // Holds the money-score of a postalcode
    // money-score is just a value that correlates with the amount people spend during their shopping sessions
    private Map<String, Integer> postalCodeScores = new HashMap<String, Integer>();
    private List<Customer> customers = new ArrayList<Customer>();
    private List<Product> products = new ArrayList<Product>();

    public Simulator() {
        this.drawBoxAround("Simulation Started", Colors.ANSI_PURPLE);
        this.generateCustomers();
        this.generatePostalCodeScores();
        this.match();
    }

    private void generateCustomers() {
        this.drawBoxAround("Customer generation started", Colors.ANSI_BLUE);

        for (int i = 0; i < Constants.surnames.length; i++) {
            customers.add(new Customer(
                Constants.surnames[i], 
                Math.randomInt(Constants.minAge, Constants.maxAge),
                Integer.toString(Math.randomInt(Constants.startingPostalCode, Constants.endingPostalCode))
            ));
        }

        this.drawLine("Created " + Constants.surnames.length + " customers", Colors.ANSI_GREEN);
        this.drawLine("");
    }

    private void generatePostalCodeScores() {
        this.drawBoxAround("Generating postal code scores", Colors.ANSI_BLUE);

        for (int i = 0; i <= Constants.endingPostalCode - Constants.startingPostalCode; i++) {
            postalCodeScores.put(
                Integer.toString(Constants.startingPostalCode + i),
                Math.randomInt(10, 100) 
            );
        }

        this.drawLine("Generated scores for " + (postalCodeScores.size()) + " postal codes", Colors.ANSI_GREEN);
        this.drawLine("");
    }

    private void match() {

        for (int i = 0; i < this.customers.size(); i++) {
            Customer c = this.customers.get(i);
            Integer postalCodeScore = postalCodeScores.get(c.getPostalCode());
            this.drawLine(c.getName() + ": " + c.getPostalCode() + ", : " + postalCodeScore);
        }
    }

    public List<Customer> getCustomers() {return this.customers;}
    public List<Product> getProducts() {return this.products;}
    public Map<String, Integer> getPostalCodeScores() {return this.postalCodeScores;}
}
