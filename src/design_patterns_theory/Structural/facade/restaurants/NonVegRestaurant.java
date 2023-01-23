package design_patterns_theory.Structural.facade.restaurants;

import design_patterns_theory.Structural.facade.menu.Menu;
import design_patterns_theory.Structural.facade.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel
{
    public Menu getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}