import enums.ECategory;

class Product {
    String name;
    int id;
    int price;
    ECategory category;

    public Product(String name, int id, int price, ECategory category) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
    }
}