/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.RoomBooking;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ashis
 */
public class HotelOrderDirectory {
    List<HotelOrder> orders;
    static HotelOrderDirectory orderDirectory;

    public HotelOrderDirectory() {
        orders = new ArrayList<>();
    }
    
    
    
    public HotelOrder createOrder() {
        HotelOrder order = new HotelOrder();
        orders.add(order);
        return order;
    }
    
    
}
