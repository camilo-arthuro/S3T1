package level1;

import java.util.Scanner;

public class Store {
    public static void runProgram(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        String product = "";
        boolean buying = true;
        Undo command = Undo.getInstance();

        do {
            System.out.println("Welcome to our store, how may I help you?");
            System.out.println("1. Add product to the cart. \n" +
                    "2. Remove last product from the cart. \n" +
                    "0. Exit");
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    System.out.println("Write the product name: ");
                    product = input.nextLine();
                    command.addOrder(product);
                    System.out.println("Product added to the list");
                    command.showList();
                    System.out.println();
                    break;
                case 2:
                    command.removeLastProduct();
                    System.out.println("Last product was removed");
                    command.showList();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Thank you for your purchase, good bye!");
                    buying = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (buying);

    }
}
