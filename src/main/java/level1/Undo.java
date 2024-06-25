package level1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private ArrayList<String> orders;

    private Undo (){
        orders = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(String order){
        orders.add(order);
    }

    public void removeLastProduct(){
        if (!orders.isEmpty()){
            orders.remove(orders.size() - 1);
        } else {
            System.out.println("No orders to remove!");
        }
    }

    public void showList(){
        if (orders.isEmpty()){
            System.out.println("No orders!");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println(orders.get(i));
            }
        }
    }
}
