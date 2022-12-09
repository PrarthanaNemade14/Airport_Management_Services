/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.restaurantOrder;

import Backend.restaurant.Dish;


/**
 *
 * @author viral
 */
public class RestaurantOrderItem {
    private Integer orderItemId;
    private Dish dish;
    private Integer quantity;

    public RestaurantOrderItem() {
    }

    public RestaurantOrderItem(Integer orderItemId, Dish dish, Integer quantity) {
        this.orderItemId = orderItemId;
        this.dish = dish;
        this.quantity = quantity;
    }

    

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
    
    
}
