/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.RoomBooking;

import business.hotel.HotelRoom;


/**
 *
 * @author viral
 */
public class HotelOrderItem {
    private Integer orderItemId;
    private HotelRoom room;
    private Integer quantity;

    public HotelOrderItem() {
    }

    public HotelOrderItem(Integer orderItemId, HotelRoom room, Integer quantity) {
        this.orderItemId = orderItemId;
        this.room = room;
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

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }
    
    
}
