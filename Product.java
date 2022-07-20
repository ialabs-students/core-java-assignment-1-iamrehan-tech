import java.util.ArrayList;
import java.util.Iterator;

public class Product {
    private int productCode;
    private String name;
    private double price;
    private String category;

    public Product(int productCode, String name, double price, String category) {
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static ArrayList<Product> getProductsList() {
        ArrayList<Product> item = new ArrayList<>();
        Product a1 = new Product(32, "Men's Jen's", 999.00, "fashion");
        Product a2 = new Product(33, "Men's Shirt", 399.00, "fashion");
        Product b1 = new Product(101, "Watch", 2999.00, "Accessories");
        Product b2 = new Product(201, "Eirphone's", 5999.00, "Accessories");
        Product c1 = new Product(301, "Washing mchine", 12999.00, "appliences");
        Product c2 = new Product(150, "Refrigerators", 15000.00, "appliences");
        
        item.add(a1);
        item.add(a2);
        item.add(b1);
        item.add(b2);
        item.add(c1);
        item.add(c2);
        return item;
    }

    public static void main(String[] args) {

        // Creating the object of the product service!
        ProductService productService = new ProductService();

        String prodName = productService.findNameByCode(101);
        System.out.println(prodName);

   
        Product product_obj = productService.findMaxPriceProduct("fashion");
        System.out.println(product_obj);

    
        ArrayList<Product> products = productService.getProductsByCategory("fashion");
        if (products != null) {
            Iterator itr = products.iterator();
            while (itr.hasNext()) {
                Product product = (Product) itr.next();
                System.out.println("[ product code: " + product.getProductCode() + ", product name: "
                        + product.getName() + ", product price: Rs." + product.getPrice() + ", product catagory: "
                        + product.getCategory() + " ]");
            }
        }
    }
}