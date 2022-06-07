
import java.text.BreakIterator;
import java.util.ArrayList;

public class ProductService {
    // making references and creating variables!
    Product product;
    public static ArrayList<Product> prods = Product.getProductsList();
    String prodName;
    double temp = 0.00;
    Product product_object, temp_obj;

    ArrayList<Product> newList = new ArrayList<>();
    public String findNameByCode(int productCode) {

        try{
        prods.forEach(
                a -> {
                    if (productCode == a.getProductCode()) {
                        prodName = a.getName();   
                     }
                });
            } 
            catch(Exception e)
            {{
                    prodName = null;
                    System.out.println(prodName);
                    }
            }
        return ("Product Name: " + prodName);
    }

    public Product findMaxPriceProduct(String catagory) {
        prods.forEach(
                a -> {
                    if (catagory == a.getCategory()) {
                        product_object = a;
                        if (temp < a.getPrice()) {
                            temp = a.getPrice();
                            temp_obj = a;
                        }
                    } else {
                        product_object = null;
                    }
                });
        return (temp_obj);
       
    }

    public ArrayList<Product> getProductsByCategory(String catagory) {
        prods.forEach(
                a -> {
                    if (catagory == a.getCategory()) {
                        newList.add(a);
                    } else {
                        product_object = null;
                    }
                });
        return newList;
    }
}