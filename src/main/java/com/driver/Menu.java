package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> menuItems;

    public Menu() {
    	// your code goes here
        menuItems=new ArrayList<Food>();
         menuItems.add(new Food(1, "Pizza", 250.0));
        menuItems.add(new Food(2, "Burger", 150.0));
        menuItems.add(new Food(3, "Pasta", 200.0));
    }

    public void addMenuItem(Food food) {

    	// your code goes here
        menuItems.add(food);
    }

    public List<Food> getMenuItems() {
    	// your code goes here
        
        return menuItems;
    }

    public Food getMenuItemById(int id) {
    	// your code goes here
        for (Food food : menuItems) {
            if (food.getId() == id) {
                return food;
            }
        }
        return null;
       
    }
}