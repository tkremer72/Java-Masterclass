# Sorted Collections

# Sorted Collections Challenge
Modify the program so that adding items to the shopping basket doesn't
actually reduce the stock count but, instead, reserves the requested
number of items.

    You will need to add a "reserved" field to the StockItem class to store the
    number of items reserved.

    Items can continue to be added to the basket, but it should not be possible to
    reserve more than the available stock of any item. An item's available stock
    is the stock count less the reserved amount.

    The stock count for each item is reduced when a basket is checked out, at which
    point all reserved items in the basket have their actual stock count reduced.

    Once checkout is complete, the contents of the basket are cleared.

    It should also be possible to "unreserve" items that were added to the basket
    by mistake.

    The program should prevent any attempt to unreserve more items than were
    reserved for a basket.

    Add code to Main that will unreserve items after they have been added to the basket,
    as well as unreserving items that have not been added to make sure that the code
    can cope with invalid requests like that.

    After checking out the baskets, display the full stock list and the contents of each
    basket that you created.

#Warning fixes in StockItem.java
before:
private double price;
after:
private final double price;
before:
private int quantityInStock = 0;
after:
private int quantityInStock;

removed this setter as it wasn't being used.
    public void setPrice(double price) {
        if(price > 0.0) {
           this.price = price;
        }
    }

# Warning fixes in Basket.java
//Before
//    String s = name + "\nShopping basket " + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
//After
StringBuilder s = new StringBuilder(name + "\nShopping basket " + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n");

# Warning fixes in StockList.java
Before:
public int addStock(StockItem item) {
if(item != null) {
// check if already have quantities of this item
StockItem inStock = list.getOrDefault(item.getName(), item);
// If there are already stocks on this item, adjust the quantity
if(inStock != item) {
item.adjustStock(inStock.availableQuantity());
}

list.put(item.getName(), item);
        return item.availableQuantity();
        }
        return 0;
    }

After:
public void addStock(StockItem item) {
if(item != null) {
// check if already have quantities of this item
StockItem inStock = list.getOrDefault(item.getName(), item);
// If there are already stocks on this item, adjust the quantity
if(inStock != item) {
item.adjustStock(inStock.availableQuantity());
}

            list.put(item.getName(), item);
            item.availableQuantity();
        }
    }

Before:
public int sellStock(String item, int quantity) {
//        StockItem inStock = list.getOrDefault(item, null);
//
//        if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity >0)) {
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;
StockItem inStock = list.get(item);
if((inStock != null) && (quantity >0)) {
return inStock.finaliseStock(quantity);
}
return 0;
}

After:
public void sellStock(String item, int quantity) {
//        StockItem inStock = list.getOrDefault(item, null);
//
//        if((inStock != null) && (inStock.availableQuantity() >= quantity) && (quantity >0)) {
//            inStock.adjustStock(-quantity);
//            return quantity;
//        }
//        return 0;
StockItem inStock = list.get(item);
if((inStock != null) && (quantity >0)) {
inStock.finaliseStock(quantity);
}
}

Before: -> This method was never used so used safe delete to remove it from the project.
public Map<String, Double> PriceList() {
Map<String, Double> prices = new LinkedHashMap<>();
for(Map.Entry<String, StockItem> item : list.entrySet()) {
prices.put(item.getKey(), item.getValue().getPrice());
}
return Collections.unmodifiableMap(prices);
}

Before:
s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: $";
s = s + String.format("%.2f",itemValue) + "\n";

After:
s.append(stockItem).append(". There are ").append(stockItem.availableQuantity()).append(" in stock. Value of items: $");
s.append(String.format("%.2f", itemValue)).append("\n");

# Warning Fixes in Main.java

Before:
private static StockList stockList = new StockList();

After:
private final static StockList stockList = new StockList();
