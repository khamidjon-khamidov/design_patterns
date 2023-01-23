package head_first_design_patterns.iterator;

import head_first_design_patterns.iterator.menus.CafeMenu;
import head_first_design_patterns.iterator.menus.DinerMenu;
import head_first_design_patterns.iterator.menus.PancakeHouseMenu;
import head_first_design_patterns.iterator.waiter.Waitress;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}