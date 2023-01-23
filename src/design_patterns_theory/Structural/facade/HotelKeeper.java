package design_patterns_theory.Structural.facade;

import design_patterns_theory.Structural.facade.menu.Both;
import design_patterns_theory.Structural.facade.menu.NonVegMenu;
import design_patterns_theory.Structural.facade.menu.VegMenu;
import design_patterns_theory.Structural.facade.restaurants.NonVegRestaurant;
import design_patterns_theory.Structural.facade.restaurants.VegNonBothRestaurant;
import design_patterns_theory.Structural.facade.restaurants.VegRestaurant;

// The facade pattern is appropriate when you have a complex system that
// you want to expose to clients in a simplified way, or you want to make
// an external communication layer over an existing system which is
// incompatible with the system. Facade deals with interfaces, not
// implementation. Its purpose is to hide internal complexity behind
// a single interface that appears simple on the outside.
public class HotelKeeper
{
    public VegMenu getVegMenu()
    {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }
      
    public NonVegMenu getNonVegMenu()
    {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }
      
    public Both getVegNonMenu()
    {
        VegNonBothRestaurant v = new VegNonBothRestaurant();
        Both bothMenu = (Both)v.getMenus();
        return bothMenu;
    }    
}