package head_first_design_patterns.iterator.menus;

import head_first_design_patterns.iterator.Menu;
import head_first_design_patterns.iterator.iterators.DinerMenuIterator;
//import head_first_design_patterns.iterator.Iterator;
import head_first_design_patterns.iterator.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT",
                "Fakin Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price); if (numberOfItems >= MAX_ITEMS) {
        System.err.println("Sorry, menu is full! Can’t add item to menu"); } else {
        menuItems[numberOfItems] = menuItem;
        numberOfItems = numberOfItems + 1; }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    // other methods here
}
// a couple of other Diner Menu items added here }