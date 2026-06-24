import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {

        for (int i = 0; i < products.length; i++) {

            if (products[i].productId == targetId) {
                return products[i];
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Mobile", "Electronics"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Headphones", "Electronics")
        };

        int searchId = 103;

        System.out.println("=== Linear Search ===");
        Product linearResult = linearSearch(products, searchId);

        if (linearResult != null) {
            linearResult.display();
        } else {
            System.out.println("Product Not Found");
        }

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        System.out.println("\n=== Binary Search ===");
        Product binaryResult = binarySearch(products, searchId);

        if (binaryResult != null) {
            binaryResult.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}