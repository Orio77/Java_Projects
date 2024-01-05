package algorithms.exercise1_sorting.scenario1;

public class Product {
    private int price;
    private String category;
    private int productID;

    public Product(int price, String category) {
        this.price = price;
        this.category = category;
        productID = hashCode();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }
}
