/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class HotelDirectory {
    List<Hotel> hotels;

    public HotelDirectory() {
        hotels = new ArrayList<>();
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
    
    public Hotel addHotel()
    {
        Hotel hotel = new Hotel();
        hotels.add(hotel);
        return hotel;
    }
    
    public Hotel getHotelFromUsername(String username)
    {
        for(Hotel hotel : hotels)
        {
            if(username.equals(hotel.getUserName()))
                return hotel;
        }
        return null;
    }
    
    public Hotel getHotelFromName(String name)
    {
        for(Hotel hotel : hotels)
        {
            if(name.equals(hotel.getName()))
                return hotel;
        }
        return null;
    }
    
    public void deleteHotelFromUsername(String username)
    {
        for(Hotel hotel : hotels)
        {
            if(hotel.getUserName().equals(username))
            {
                hotels.remove(hotel);
                return;
            }
        }
    }
    
    
}
