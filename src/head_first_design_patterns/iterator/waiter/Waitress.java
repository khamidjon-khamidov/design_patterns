package head_first_design_patterns.iterator.waiter;

import java.util.ArrayList;
import java.util.Iterator;

import head_first_design_patterns.iterator.Menu;
import head_first_design_patterns.iterator.MenuItem;
import head_first_design_patterns.iterator.menus.CafeMenu;
import head_first_design_patterns.iterator.menus.DinerMenu;
import head_first_design_patterns.iterator.menus.PancakeHouseMenu;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();

        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
// other methods here
}