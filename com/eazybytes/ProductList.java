import java.util.Scanner;

class Product{
    int id;
    String name;
    float price;
}
public class ProductList {
    public static void main(String[] args) {

       Product[] product = allProducts();
       printProducts(product);
    }

    public static Product[] allProducts() {
        Scanner sc = new Scanner(System.in);
        Product[] prod = new Product[2];


        for (int i = 0; i < 2; i++) {
            Product product = new Product();

            System.out.println("Enter product id :");
            product.id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter product name :");
            product.name = sc.nextLine();

            System.out.println("Enter product price :");
            product.price = sc.nextFloat();

            prod[i] = product;
        }
        return prod;
    }

    public static void printProducts(Product[] prod) {
        for (Product pro : prod) {
            System.out.println("Product id :" + pro.id + "  Product name :" + pro.name + "  1" +
                    "Product price :" + pro.price);
        }
    }
}
