import java.util.ArrayList;
import java.util.List;

class Customer extends Draw {
    private String name;
    private int age;
    private String postalCode;
    private List<ShoppingSession> shoppingSessions;

    public Customer (String name, int age, String postalCode) {
        this.name = name;
        this.age = age;
        this.postalCode = postalCode;
        this.shoppingSessions = new ArrayList<ShoppingSession>();
    }
    
    public void addShoppingSession(ShoppingSession session) {
        this.shoppingSessions.add(session);
        this.drawBoxAround("Added a session", Colors.ANSI_GREEN);
    }

    // Getters
    public String getPostalCode() { return this.postalCode; }
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public List<ShoppingSession> getShoppingSessions() { return this.shoppingSessions; }
}