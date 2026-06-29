import java.util.Scanner;

class Product
{
    int product_id;
    String product_name;
    double price;
    int quantity;
    String category;
    Product(int product_id,String product_name,double price,int quantity,String category)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }
    void display()
    {
        System.out.println("===============");
        System.out.println("Product Details");
        System.out.println("===============");
        System.out.println("Product Id: "+product_id);
        System.out.println("Product Name: "+product_name);
        System.out.println("Price: "+price);
        System.out.println("Quantitiy: "+quantity);
        System.out.println("Category: "+category);
    }
}
class InventorySystem
{
    Product[] products;
    int count;
    InventorySystem(int size)
    {
        products=new Product[size];
        count=0;
    }
    void addproduct(int product_id,String product_name,double price,int quantity,String category)
    {
        for(int i=0;i<count;i++)
{
    if(products[i].product_id==product_id)
    {
        System.out.println("Product ID already exists.");
        return;
    }
}
        if(count>=products.length)
        {
            System.out.println("Product cannot be added");
            System.out.println("Inventory is full");
        }
        else
        {
            products[count]=new Product(product_id,product_name,price,quantity,category);
            count++;
            System.out.println("Product is added successfully");
        }
    }
    void viewProducts() {
        if (count == 0) {
            System.out.println("No products in inventory.");
            return;
        }

        for (int i = 0; i < count; i++) {
            products[i].display();
        }
    }
    void searchProduct(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].product_id == id) {
                products[i].display();
                return;
            }
        }
        System.out.println("Product not found");
    }
    void updateProduct(Scanner sc)
    {
        System.out.print("Enter Product ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < count; i++) {

            if (products[i].product_id == id) {

                
                
                System.out.print("Enter New Product name: ");
                products[i].product_name = sc.nextLine();

                System.out.print("Enter New Price: ");
                products[i].price = sc.nextDouble();

                System.out.print("Enter New Quantity: ");
                products[i].quantity = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Category: ");
                products[i].category=sc.nextLine();
                System.out.println("Product Updated Successfully.");
                return;
            }
        }
        System.out.println("product not found");

    }

    void deleteproduct(Scanner sc) {

        System.out.print("Enter product ID to Delete: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (products[i].product_id== id) {

                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }

                products[count - 1] = null;
                count--;

                System.out.println("Product Deleted Successfully.");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }
    void updatestock(Scanner sc)
    {
    

    System.out.println("Enter the product id");
    int id = sc.nextInt();

    System.out.println("Enter the changed quantity");
    int changeqty = sc.nextInt();

    for(int i = 0; i < count; i++)
    {
        if(products[i].product_id == id)
        {
            if(products[i].quantity + changeqty < 0)
            {
                System.out.println("Stock cannot be negative");
                return;
            }

            products[i].quantity += changeqty;
            System.out.println("Stock updated successfully");
            return;
        }
    }

    System.out.println("Product not found");
}
    void lowStock(Scanner sc)
{
    System.out.println("Enter the threshold");
    int threshold = sc.nextInt();

    boolean found = false;

    for(int i = 0; i < count; i++)
    {
        if(products[i].quantity < threshold)
        {
            products[i].display();
            found = true;
        }
    }

    if(!found)
    {
        System.out.println("No low stock products found.");
    }
}
}
public class InventorySystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InventorySystem system = new InventorySystem(100);

        int choice;

        do {
            System.out.println("\n===== INVENTORY MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Update Stock");
            System.out.println("7. Low Stock Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();

                    system.addproduct(id, name, price, qty, cat);
                    break;
                case 2:
                    system.viewProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    system.searchProduct(sc.nextInt());
                    break;

                case 4:
                system.updateProduct(sc);
                break;

                case 5:
                    system.deleteproduct(sc);
                    break;

                case 6:
                    system.updatestock(sc);
                    break;

                case 7:
                    system.lowStock(sc);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                System.out.println("Invalid Choice");
                } }while(choice != 8);

        sc.close();
    
}
    }
        
    
