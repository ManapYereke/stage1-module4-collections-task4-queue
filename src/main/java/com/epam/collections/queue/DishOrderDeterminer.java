package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> order = new ArrayList<>();
        List<Integer> dishes = new ArrayList<>();
        for(int i = 1; i <= numberOfDishes; i++)
            dishes.add(i);
        while (!dishes.isEmpty()) {
            for(int i = 1; i < everyDishNumberToEat; i++)
                dishes.add(dishes.remove(0));
            order.add(dishes.remove(0));
        }
        return order;
    }
}
