import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "krzeslo"));
        items.add(new Item(2, "stolik"));
        items.add(new Item(3, "kanapa"));
        items.add(new Item(4, "fotel"));
        items.add(new Item(5, "szafa"));

        for(int i=0;i<items.size();i++){
            items.get(i).Show();
        }

        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {
            itemsMap.put(item.getID(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        items.add(new Item(6, "polka"));
        items.add(new Item(7, "lozko"));
        items.add(new Item(8, "schodki"));
        items.add(new Item(9, "konsola"));
        items.add(new Item(10, "taboret"));
        items.add(new Item(11, "drabina"));
        items.add(new Item(12, "skrzynka"));
        items.add(new Item(13, "zmywarka"));
        items.add(new Item(14, "pralka"));
        items.add(new Item(15, "kosiarka"));

        List<Item> subList = items.subList(0, 5);

        HashSet<Item> itemsSet = new HashSet<>(subList);

        for (Item item : itemsSet) {
            System.out.println(item);
        }
    }
}