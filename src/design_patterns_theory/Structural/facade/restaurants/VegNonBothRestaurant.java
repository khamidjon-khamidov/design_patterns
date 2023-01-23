package design_patterns_theory.Structural.facade.restaurants;

import design_patterns_theory.Structural.facade.menu.Both;
import design_patterns_theory.Structural.facade.menu.Menu;

public class VegNonBothRestaurant implements Hotel
{
    public Menu getMenus()
    {
        Both b = new Both();
        return b;
    }
}