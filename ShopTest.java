import java.util.*;

public class ShopTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();
        boolean exit = false;
        while (!exit) {
            System.out.println("======== WELCOME TO SHOP =========");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Prodcut By Name");
            System.out.println("4. Search Prodcut By Price range");
            System.out.println("5. Display All Products ");
            System.out.println("6. Display All Custmoers.");
            System.out.println("7. Add Customer");
            System.out.println("Enter your choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Product Name : ");
                    String productName = scanner.next();

                    System.out.println("Enter ProductId : ");
                    String productId = scanner.next();

                    System.out.println("Enter price : ");
                    double price = scanner.nextDouble();
                    System.out.println("Enter Available Quantity : ");
                    int quantityAvailable = scanner.nextInt();
                    break;


                case 2:
                    System.out.println("Enter Product Id to remove : ");
                    String removeProduct = scanner.next();
                    shop.removeProduct(removeProduct);
                    System.out.println("Prodcut with id " + removeProduct + " is removed successfully");
                    break;

                case 3:
                    System.out.println("Enter product name to search : ");
                    String searchproductName = scanner.next();

                    Product searchProductByName = shop.searchProductByName(searchproductName);
                    if (searchproductName != null) {
                        System.out.println("Product Found");
                        System.out.println("Prodcut Id : " + searchProductByName.getProductId() + "Product name is : " + searchProductByName.getProductName() + "Product Price is : " + searchProductByName.getPrice());
                    } else {
                        System.out.println("Product Not found");
                    }
                    break;


                case 4:
                    System.out.println("Enter Minimum price to search product : ");
                    double miniPrice = scanner.nextDouble();
                    System.out.println("Enter Maximum price to search product :");
                    double maxPrice = scanner.nextDouble();

                    ArrayList<Product> prodcutsInRange = shop.searchProductByPriceRange(miniPrice, maxPrice);
                    if (!prodcutsInRange.isEmpty()) {
                        System.out.println("Price in Range : ");
                        for (Product product : prodcutsInRange) {
                            System.out.println("Prodcut Id :" + product.getProductId() +
                                    "Product name is :" + product.getProductName() +
                                    "Product price is :" + product.getPrice());
                        }
                    }
                    break;

                case 5:
                    shop.displayAllProducts();
                    break;

                case 6:
                    shop.displayAllCustomers();
                    break;
                case 7:

                    System.out.println("Enter Customer Name : ");
                    String customerName = scanner.next();

                    System.out.println("Enter customerId : ");
                    String customerId = scanner.next();

                    System.out.println("Enter Mobile Number : ");
                    String contactNumber = scanner.next();
                    shop.addCustomer(new Customer(customerId, customerName, contactNumber, null));

                    break;
                default:
                    System.out.println("Invalid choice ");

            }

        }
    }
}
