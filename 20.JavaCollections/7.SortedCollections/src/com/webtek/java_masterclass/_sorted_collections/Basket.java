package com.webtek.java_masterclass._sorted_collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    //Create a method called addToBasket

    public int addToBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

//Create a method to remove items from the basket
    public int removeFromBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            //Check if item is already in basket
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket - quantity;
            if(newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {
                list.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    //Create a method to empty the basket
    public void clearBasket() {
        this.list.clear();
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        //Before
    //    String s = name + "\nShopping basket " + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        //After
        StringBuilder s = new StringBuilder(name + "\nShopping basket " + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n");
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item: list.entrySet()) {
            s.append(item.getKey()).append(". ").append(item.getValue()).append(" purchased.\n");
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost $" + String.format("%.2f", totalCost);
    }
}
