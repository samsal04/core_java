package com.apolis.javapractice;

import java.util.ArrayList;
import java.util.List;


// Create a command interface
interface Order{
    void execute();
}
// Create a request class
class Stock{

    private String name="ABC";
    private int quantity= 10;

    public void buy()
    {
        System.out.println("Stock [Name: "+name+" Quantity: "+quantity+ " ] bought");
    }
    public void sell()
    {
        System.out.println("Stock [Name: "+name+" Quantity: "+quantity+ " ] sold");
    }
}
// Create concrete classes implementing the Order interface
class BuyStock implements Order{
    private Stock abcStock;
    public BuyStock(Stock abcStock){
        this.abcStock=abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}

class SellStock implements Order{
    private Stock abcStock;
    public SellStock(Stock abcStock){
        this.abcStock=abcStock;
    }
    @Override
    public void execute() {
        abcStock.sell();
    }
}

// Create command invoker class
class Broker{

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder(){

        for (Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }

}

public class CommandDesignPattern {
    public static void main(String[] args) {

        Stock abcStock= new Stock();

        BuyStock buyStockOrder= new BuyStock(abcStock);
        SellStock sellStockOrder= new SellStock(abcStock);

        Broker broker= new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrder();
    }
}

