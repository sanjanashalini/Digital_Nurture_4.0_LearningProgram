package Week1.DataStructuresAndAlgorithms.EcommerceSearchFunction;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
                new Item(201, "Blender", "Appliances"),
                new Item(202, "Helmet", "Safety Gear"),
                new Item(203, "Notebook", "Stationery"),
                new Item(204, "Backpack", "Bags"),
                new Item(205, "Drill", "Tools")
        };

        System.out.println("Linear Search for 'Notebook':");
        Item result1 = Search.linearSearch(items, "Notebook");
        System.out.println(result1 != null ? result1 : "Item not found.");

        System.out.println("\nBinary Search for 'Notebook':");
        Item result2 = Search.binarySearch(items, "Notebook");
        System.out.println(result2 != null ? result2 : "Item not found.");
    }
}
