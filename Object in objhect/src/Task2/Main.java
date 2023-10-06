package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cafe cafeOne = new Cafe();
        cafeOne.loadMenuData();

        /*for (int i = 0; i < cafeOne.getCoffeeMenu().size(); i++) {
            String coffee = cafeOne.getCoffeeMenu().get(i);
            System.out.println(coffee);
        }*/


        displayMenu(cafeOne);

    }

    public static void displayMenu(Cafe cafe) {
        for (String menuItem : cafe.getCoffeeMenu())
        {
            System.out.println(menuItem);
        }
    }
}

