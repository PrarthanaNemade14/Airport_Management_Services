/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.RoomOrder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viral
 */
public class RoomOrderDirectory {
    List<RoomOrder> Roomorders;
    static RoomOrderDirectory RoomorderDirectory;

    public RoomOrderDirectory() {
        Roomorders = new ArrayList<>();
    }
    
    public RoomOrder createOrder() {
        RoomOrder order = new RoomOrder();
        Roomorders.add(order);
        return order;
    }
    
    
}
