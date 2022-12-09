/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.restaurantOrder;

import Backend.customer.Customer;
import Backend.restaurant.Restaurant;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viral
 */
public class RestaurantOrder {
    public static int orderIdCounter;
    private Integer orderId;
    private Customer customer;
    private Restaurant restaurant;
    private List<RestaurantOrderItem> orderItems;
    private int restaurantRating;
    private int deliveryRating;
    private String comment;
    private String orderTotal;
    private String deliveryStatus;
    private boolean isDelivered;

    public RestaurantOrder() {
        this.orderId = ++orderIdCounter;
        this.orderItems = new ArrayList<>();
    }

    public RestaurantOrder(Integer orderId, Customer customer, Restaurant restaurant, List<RestaurantOrderItem> orderItems, int restaurantRating, int deliveryRating, String comment, boolean isDelivered) {
        orderId = ++orderIdCounter;
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItems = new ArrayList<>();
        this.restaurantRating = restaurantRating;
        this.deliveryRating = deliveryRating;
        this.comment = comment;
        this.isDelivered = isDelivered;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public List<RestaurantOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<RestaurantOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(int restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public int getDeliveryRating() {
        return deliveryRating;
    }

    public void setDeliveryRating(int deliveryRating) {
        this.deliveryRating = deliveryRating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(boolean isDelivered) {
        this.isDelivered = isDelivered;
    }

    public String getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
    
    public RestaurantOrderItem addOrderItem()
    {
        RestaurantOrderItem orderItem = new RestaurantOrderItem();
        orderItems.add(orderItem);
        return orderItem;
    }
    
    @Override
    public String toString()
    {
        return orderId+"";
    }
    
}
