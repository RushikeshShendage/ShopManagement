import java.util.*;
public class Shop {
    private HashMap<String, Product> products;
    private  HashMap<String, Customer> customers;

    public Shop() {
        this.products = new HashMap<>();
        this.customers = new HashMap<>();

    }
    public void addProduct(Product product)
    {
        //products.put(product.getProductId(), product);
        products.put(product.getProductId(), product) ;
    }
    public void removeProduct(String productId) {
        // products.remove(productId );
        products.remove(productId);
    }
    public void addCustomer(Customer customer) {
        // customers.put(customer.getCustomerId(), customer);
        customers.put(customer.getCustomerId(), customer);
    }

    public void removeCustomer(String customerId){
        customers.remove(customerId);
    }
    public Product  searchProductByName(String productName) {
        for ( Product product :  products.values()) {
            if(product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }

        }
        return null;
    }

    public ArrayList<Product> searchProductByPriceRange(double minPrice, double maxPrice){
        ArrayList<Product> result = new ArrayList<>();
        {
            for(Product product :  products.values()) {
                if(product.getPrice() >= minPrice && product.getPrice() <= maxPrice ) {
                    result.add(product);
                }
            }
        }
        return result;
    }
    public void displayAllProducts() {
        int flag=0;


        System.out.println("Displaying all products");

        for(Product product : products.values()) {
            flag = 1;
            System.out.println("Product Id : "+product.getProductId()+"Product Name : "+product.getProductName()+
                    "Product price is : "
                    +product.getPrice() +"Quantity available" + product.getQuantityAvailable());
        }
        if(flag ==0) {
            System.out.println("No product found");
        }


    }
    public void displayAllCustomers()
    {
        System.out.println("Displaying all Customer");
        for(Customer customer  : customers.values()) {
            System.out.println("customers Id : "+customer.getCustomerId()+"customers Name : "+customer.getContactNumber()+"customers Number is : "+customer.getContactNumber());
        }
    }
}
