public class item {
    private String category;
    private double price;
    private String name;

    public item(String a, double b, String c) {
        category = a;
        price = b;
        name = c;
    }

    public String getCategory() {return category;}
    public double getPrice() {return price;}
    public String getName() {return name;}
}
