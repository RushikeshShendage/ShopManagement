import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String customerName;
    private String contactNumber;
    private ArrayList<Product> purchasedProducts;
    public Customer(String customerId, String customerName, String contactNumber, ArrayList<Product>purchasedProducts) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.purchasedProducts=purchasedProducts;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(ArrayList<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }
    public void removiProduct(Product product) {
        purchasedProducts.remove(product);
    }

    public ArrayList<Product> displayProducts(){
        return purchasedProducts;

    }


    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
                + contactNumber + ", purchasedProducts=" + purchasedProducts + ", getCustomerId()=" + getCustomerId()
                + ", getCustomerName()=" + getCustomerName() + ", getContactNumber()=" + getContactNumber()
                + ", getPurchasedProducts()=" + getPurchasedProducts() + "]";
    }
}
