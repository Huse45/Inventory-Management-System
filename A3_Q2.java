import java.util.Scanner;
public class A3_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] price=new double[5];
        int[] quantity=new int[5];
        String[] product_name=new String[5];
        int choice;
        System.out.println("Welcome to Inventory Management System\n");
        System.out.println("Enter details for 5 products (price, quantity, name):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ": ");
            System.out.println("Enter product details (price, quantity, name):");
            price[i] = sc.nextDouble();
            quantity[i] = sc.nextInt();
            product_name[i] = sc.nextLine().replaceFirst("^\\s+", "");
        }

        do{
            System.out.println("\nInventory Management Menu:");
            System.out.println("    1. Display information of all products");
            System.out.println("    2. Update the quantity of a product");
            System.out.println("    3. Search for a product by name");
            System.out.println("    4. Find the product with the lowest quantity");
            System.out.println("    5. Find the product with the highest price ");
            System.out.println("    6. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("\nProduct List:");
                    System.out.println("    Product 1:");
                    System.out.println("    Name:"+product_name[0]);
                    System.out.println("    Price: $"+price[0]);
                    System.out.println("    Quantity: "+quantity[0]);
                    System.out.println("---------------------------");
                    System.out.println("    Product 2:");
                    System.out.println("    Name:"+product_name[1]);
                    System.out.println("    Price: $"+price[1]);
                    System.out.println("    Quantity: "+quantity[1]);
                    System.out.println("---------------------------");
                    System.out.println("    Product 3:");
                    System.out.println("    Name:"+product_name[2]);
                    System.out.println("    Price: $"+price[2]);
                    System.out.println("    Quantity: "+quantity[2]);
                    System.out.println("---------------------------");
                    System.out.println("    Product 4:");
                    System.out.println("    Name:"+product_name[3]);
                    System.out.println("    Price: $"+price[3]);
                    System.out.println("    Quantity: "+quantity[3]);
                    System.out.println("---------------------------");
                    System.out.println("    Product 5:");
                    System.out.println("    Name:"+product_name[4]);
                    System.out.println("    Price: $"+price[4]);
                    System.out.println("    Quantity: "+quantity[4]);
                    System.out.println("---------------------------");
                    break;
                case 2:
                    int product_number;
                    int new_quantity;
                    System.out.print("Enter the product number (1-5) to update quantity: ");
                    product_number=sc.nextInt();
                    if(product_number==1){
                        System.out.print("Enter new quantity for "+product_name[0]+": ");
                        new_quantity=sc.nextInt();
                        quantity[0]=new_quantity;
                    }else if(product_number==2){
                        System.out.print("Enter new quantity for "+product_name[1]+": ");
                        new_quantity=sc.nextInt();
                        quantity[1]=new_quantity;
                    } else if (product_number==3) {
                        System.out.print("Enter new quantity for "+product_name[2]+": ");
                        new_quantity=sc.nextInt();
                        quantity[2]=new_quantity;
                    }else if (product_number==4){
                        System.out.print("Enter new quantity for "+product_name[3]+": ");
                        new_quantity=sc.nextInt();
                        quantity[3]=new_quantity;
                    }else if (product_number==5){
                        System.out.print("Enter new quantity for "+product_name[4]+": ");
                        new_quantity=sc.nextInt();
                        quantity[4]=new_quantity;
                    }
                    System.out.println("Quantity updated successfully!");
                    break;
                case 3:
                    System.out.println("Enter the name of the product to search for:");
                    String search=sc.nextLine().toLowerCase();
                    for (int i = 0; i < 5; i++) {
                        if (product_name[i].toLowerCase().equals(search)) {
                            System.out.println("\nProduct Found:");
                            System.out.println("    Name: " + product_name[i]);
                            System.out.println("    Price: $" + price[i]);
                            System.out.println("    Quantity: " + quantity[i]);
                            break;
                        }
                    }
                      break;
                
                case 4:
                    int lowest_quantity=0;
                    System.out.println("\nProduct with the Lowest Quantity:");
                    for(int i=1;i<5;i++){
                        if(quantity[i]<quantity[lowest_quantity]){
                            lowest_quantity=i;
                        }
                    }
                    System.out.print("    Name: "+product_name[lowest_quantity]+"\n");
                    System.out.print("    Price: $"+price[lowest_quantity]+"\n");
                    System.out.print("    Quantity: "+quantity[lowest_quantity]+"\n");
                    break;
                case 5:
                    int highest_price=0;
                    System.out.println("\nProduct with the Highest Price:");
                    for(int j=1;j<price.length;j++){
                        if(price[j]>price[highest_price]){
                            highest_price=j;

                        }
                    }
                    System.out.print("    Name: "+product_name[(int) highest_price]+"\n");
                    System.out.print("    Price: $"+price[(int)highest_price]+"\n");
                    System.out.print("    Quantity: "+quantity[(int)highest_price]+"\n");
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;

            }

        }while(choice!=6);
        sc.close();
    }
}

