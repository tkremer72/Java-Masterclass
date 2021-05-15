package com.webtek.java_masterclass._sorted_collections;

public class StockItem implements Comparable<StockItem> {
    //Create fields
    private final String name;
    private final double price;
    private int quantityInStock;
    private int reserved = 0;

    //Create constructor to initialize fields
    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0; //or here, (but you wouldn't normally do both)
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    //Create getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }



    //Create a method to adjust the stock
    public void adjustStock(int quantity) {
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }
public int reserveStock(int quantity) {
        if(quantity <= availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
}

public int unreserveStock(int quantity) {
        if(quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
}

public int finaliseStock(int quantity) {
        if(quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
}
    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stockItem.equals");
        if(obj == this) {
            return true;
        }
        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem item) {
      //  System.out.println("Entering StockItem.compareTo");
        if(this == item) {
            return 0;
        }
        if(item != null) {
            return this.name.compareTo(item.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + ": Price $" + String.format("%.2f",this.price) + ". Reserved: " + this.reserved;
    }
}
