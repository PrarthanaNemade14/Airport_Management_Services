/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.airline.AirlineDirectory;
import business.airline.AirplaneDirectory;
import business.airport.AirportDirectory;
import business.customer.CustomerDirectory;
import business.employee.AirlineEmployeeDirectory;
import business.order.OrderDirectory;
import business.restaurant.RestaurantDirectory;
import business.restaurantOrder.RestaurantOrderDirectory;
import business.RoomOrder.RoomOrderDirectory;
import business.hotel.HotelDirectory;
import business.RoomBooking.HotelOrderDirectory;
import business.userAccount.UserAccountDirectory;
import business.util.Role;

/**
 *
 * @author viral
 */
public class EcoSystem
{
    private static EcoSystem ecoSystem;
    private AirlineDirectory airlineDirectory;
    private AirportDirectory airportDirectory;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private AirlineEmployeeDirectory airlineEmployeeDirectory;
    private RestaurantDirectory restaurantDirectory;
    private HotelOrderDirectory HotelOrderDirectory;
    private AirplaneDirectory airplaneDirectory;
    private OrderDirectory orderDirectory;
    private RoomOrderDirectory roomOrderDirectory;
    private RestaurantOrderDirectory restaurantOrderDirectory;
    private HotelDirectory HotelDirectory;
    private Role role;
    
    public EcoSystem()
    {
        airlineDirectory = new AirlineDirectory();
        airportDirectory = new AirportDirectory();
        customerDirectory = new CustomerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        airlineEmployeeDirectory = new AirlineEmployeeDirectory();
        restaurantDirectory = new RestaurantDirectory();
        airplaneDirectory = new AirplaneDirectory();
        orderDirectory = new OrderDirectory();
        restaurantOrderDirectory = new RestaurantOrderDirectory();
        HotelOrderDirectory = new HotelOrderDirectory();
        HotelDirectory = new HotelDirectory();
        roomOrderDirectory = new RoomOrderDirectory();
        role = Role.getInstance();
    }

    public RoomOrderDirectory getRoomOrderDirectory() {
        return roomOrderDirectory;
    }

    public void setRoomOrderDirectory(RoomOrderDirectory roomOrderDirectory) {
        this.roomOrderDirectory = roomOrderDirectory;
    }

    public HotelOrderDirectory getHotelOrderDirectory() {
        return HotelOrderDirectory;
    }

    public void setHotelOrderDirectory(HotelOrderDirectory HotelOrderDirectory) {
        this.HotelOrderDirectory = HotelOrderDirectory;
    }

    public HotelDirectory getHotelDirectory() {
        return HotelDirectory;
    }

    public void setHotelDirectory(HotelDirectory HotelDirectory) {
        this.HotelDirectory = HotelDirectory;
    }
    
    public static EcoSystem getInstance()
    {
        if(ecoSystem == null)
            ecoSystem = new EcoSystem();
        return ecoSystem;
    }

    public RestaurantOrderDirectory getRestaurantOrderDirectory() {
        return restaurantOrderDirectory;
    }

    public void setRestaurantOrderDirectory(RestaurantOrderDirectory restaurantOrderDirectory) {
        this.restaurantOrderDirectory = restaurantOrderDirectory;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }
    
    

    public AirlineEmployeeDirectory getAirlineEmployeeDirectory() {
        return airlineEmployeeDirectory;
    }

    public void setAirlineEmployeeDirectory(AirlineEmployeeDirectory airlineEmployeeDirectory) {
        this.airlineEmployeeDirectory = airlineEmployeeDirectory;
    }
    

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public AirlineDirectory getAirlineDirectory() {
        return airlineDirectory;
    }

    public AirportDirectory getAirportDirectory() {
        return airportDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }  
    
    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
}

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    
    
}
