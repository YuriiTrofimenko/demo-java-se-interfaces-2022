package org.tyaa.demo.java.se.interfaces;

import java.math.BigDecimal;

public class Order {

    public String goodName;
    public BigDecimal price;
    public Integer quantity;

    public Order(String goodName, BigDecimal price, Integer quantity) {
        this.goodName = goodName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format(
            "Order { goodName = '%10s', price = %10s, quantity = %3d} ",
            goodName,
            price,
            quantity
        );
        /* return "Order{" +
            "goodName='" + goodName + '\'' +
            ", price=" + price +
            ", quantity=" + quantity +
            '}'; */
    }
}
