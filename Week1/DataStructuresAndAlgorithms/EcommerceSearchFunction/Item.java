package Week1.DataStructuresAndAlgorithms.EcommerceSearchFunction;


public class Item {
    int id;
    String name;
    String category;

    public Item(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + category + ")";
    }
}
