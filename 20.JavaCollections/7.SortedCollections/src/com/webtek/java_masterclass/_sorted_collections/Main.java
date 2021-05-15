package com.webtek.java_masterclass._sorted_collections;

import java.util.Map;

public class Main {
    private final static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket thomasBasket = new Basket("Thomas");

        sellItem(thomasBasket, "Car", 1);
        System.out.println(thomasBasket);

        sellItem(thomasBasket, "Car", 1);
        System.out.println(thomasBasket);

        if(sellItem(thomasBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(thomasBasket, "Spanner", 5);
        sellItem(thomasBasket, "Juice", 4);
        sellItem(thomasBasket, "Cup", 12);
        sellItem(thomasBasket, "Bread", 1);

        Basket basket = new Basket("Customer");
        sellItem(basket,"Cup", 100);
        sellItem(basket,"Juice", 5);
        removeItem(basket,"Cup", 1);
        System.out.println(basket);

        removeItem(thomasBasket, "Car", 1);
        removeItem(thomasBasket, "Cup", 9);
        removeItem(thomasBasket, "Car", 1);
        System.out.println("Cars removed: " + removeItem(thomasBasket, "Car", 1));//should not remove any
        System.out.println(thomasBasket);

//remove all items from thomas basket
        removeItem(thomasBasket, "Bread", 1);
        removeItem(thomasBasket, "Cup", 3);
        removeItem(thomasBasket, "Juice", 4);
        removeItem(thomasBasket, "Cup", 3);
        System.out.println(thomasBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);


        StockItem car = stockList.Items().get("Car");//Check for null to keep from throwing an exception when there are no cars
        if(car != null) {
            car.adjustStock(2000);
        }
        //stockList.Items().get("Car").adjustStock(2000);
        if(car != null) {
            stockList.get("Car").adjustStock(-1000);//Stop the null exception
        }
        System.out.println(stockList);

        checkOut(thomasBasket);
        System.out.println(thomasBasket);

    }
    //Create a method to sell an item
    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0) {

            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }
//Create a method to remove an item
    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {

            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    //Create a method to check out basket
    public static void checkOut(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
