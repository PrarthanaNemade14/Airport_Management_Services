/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.hotel;

//import Business.DeliveryMan.DeliveryMan;

import business.airport.Airport;
import business.order.Order;
import business.RoomBooking.HotelOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author viral
 */
public class Hotel {
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String userName;
    private String managerName;
    private List<HotelRoom> menu;
    private List<HotelOrder> orders;
    private Airport airport;
//    private List<DeliveryMan> deliveryMans;

    public Hotel() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
//        this.deliveryMans = new ArrayList<>();
    }

    public Hotel(String name, String address, String city, String state, String postalCode, String userName, String managerName, List<HotelRoom> menu, List<HotelOrder> orders) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.userName = userName;
        this.managerName = managerName;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
//        this.deliveryMans = new ArrayList<>();
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    public List<HotelOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<HotelOrder> orders) {
        this.orders = orders;
    }

//    public List<DeliveryMan> getDeliveryMans() {
//        return deliveryMans;
//    }
//
//    public void setDeliveryMans(List<DeliveryMan> deliveryMans) {
//        this.deliveryMans = deliveryMans;
//    }

    public List<HotelRoom> getMenu() {
        return menu;
    }

    public void setMenu(List<HotelRoom> menu) {
        this.menu = menu;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public boolean addRoomToMenu(String name, String price) {
        for(HotelRoom room : menu) {
            if(room.getName().equals(name))
                return false;
        }
        HotelRoom room = new HotelRoom(name, price);
        menu.add(room);
        return true;
    }
    
    public boolean isRoomPresent(String roomName)
    {
        for(HotelRoom room : menu) {
            if(room.getName().equals(roomName)) {
                return true;
            }
        }
        return false;
    }
    
    public HotelRoom getRoomByName(String roomName)
    {
        for(HotelRoom room : menu) {
            if(room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }
    
    public void editMenu(String oldName, String newName, String price) {
        HotelRoom room = getRoomByName(oldName);
        room.setName(newName);
        room.setPrice(price);
    }
    
    public void deleteMenu(String roomName) {
        for(HotelRoom room : menu) {
            if(room.getName().equals(roomName)) {
                menu.remove(room);
                return;
            }
        }
    }
    
    @Override
    public String toString() 
    {
        return this.name;
    }
}
