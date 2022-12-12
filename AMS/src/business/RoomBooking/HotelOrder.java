/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.RoomBooking;

import business.customer.Customer;
import business.hotel.Hotel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class HotelOrder {
    public static int orderIdCounter;
    private Integer orderId;
    private Customer customer;
    private Hotel hotel;
    private List<HotelOrderItem> orderItems;
    private int hotelRating;
    private int deliveryRating;
    private String comment;
    private String orderTotal;
    private String deliveryStatus;
    private boolean isDelivered;

    public HotelOrder() {
        this.orderId = ++orderIdCounter;
        this.orderItems = new ArrayList<>();
    }

    public HotelOrder(Integer orderId, Customer customer, Hotel hotel, List<HotelOrderItem> orderItems, int hotelRating, int deliveryRating, String comment, boolean isDelivered) {
        orderId = ++orderIdCounter;
        this.customer = customer;
        this.hotel = hotel;
        this.orderItems = new ArrayList<>();
        this.hotelRating = hotelRating;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<HotelOrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<HotelOrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
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
    
    public HotelOrderItem addOrderItem()
    {
        HotelOrderItem orderItem = new HotelOrderItem();
        orderItems.add(orderItem);
        return orderItem;
    }
    
    @Override
    public String toString()
    {
        return orderId+"";
    }
    
}
