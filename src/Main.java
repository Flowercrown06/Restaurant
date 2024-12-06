import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true){
            MenuUtil.printMenu();
            System.out.println("Enter ur choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter the name of the dish: ");
                    String name = sc.next();
                    System.out.println("Enter the category of the dish: ");
                    String category= sc.next();
                    System.out.println("Enter the price of the dish: ");
                    double price= sc.nextDouble();
                    Dish dish= new Dish(name,category, price);
                    RestaurantUtil.addDish(dish);
                    System.out.println("It was successfully added");
                }
                case 2 -> {
                    System.out.println("Enter the name of the dish u wanna remove");
                    String name= sc.next();
                    RestaurantUtil.removeDish(name);
                    System.out.println("It was successfully removed");
                }
                case 3 -> {
                    RestaurantUtil.printAllDishes();
                }
            }
        }



    }
}

