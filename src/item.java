public class item {
    private String category;
    private double price;
    private String name;

    public item(String a, double b, String c) {
        name = a;
        price = b;
        category = c;
    }

    public void setPrice(double n) {
        price = n;
    }

    public String getCategory() {return category;}
    public double getPrice() {return price;}
    public String getName() {return name;}

    public String toString() {return String.format("\t\t%s\t\t\t$%.2f\t\t\t%s", name, price, category);}
}
