package design_patterns_theory.Structural.facade.restaurants;

import design_patterns_theory.Structural.facade.menu.Menu;
import design_patterns_theory.Structural.facade.menu.VegMenu;

public class VegRestaurant implements Hotel
{
    public Menu getMenus()
    {
        VegMenu v = new VegMenu();
        return v;
    }
}