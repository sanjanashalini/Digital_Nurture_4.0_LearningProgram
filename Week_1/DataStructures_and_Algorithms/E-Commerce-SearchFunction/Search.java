
import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public static Item linearSearch(Item[] items, String targetName) {
        for (Item item : items) {
            if (item.name.equalsIgnoreCase(targetName)) {
                return item;
            }
        }
        return null;
    }

    public static Item binarySearch(Item[] items, String targetName) {
        Arrays.sort(items, Comparator.comparing(i -> i.name.toLowerCase()));
        int left = 0, right = items.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = items[mid].name.compareToIgnoreCase(targetName);

            if (cmp == 0)
                return items[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}
