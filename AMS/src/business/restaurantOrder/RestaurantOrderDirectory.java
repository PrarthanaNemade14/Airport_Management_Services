/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.restaurantOrder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class RestaurantOrderDirectory {
    List<RestaurantOrder> orders;
    static RestaurantOrderDirectory orderDirectory;

    public RestaurantOrderDirectory() {
        orders = new ArrayList<>();
    }
    
    
    
    public RestaurantOrder createOrder() {
        RestaurantOrder order = new RestaurantOrder();
        orders.add(order);
        return order;
    }
    
    
}
