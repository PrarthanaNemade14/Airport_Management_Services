/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.airport;

import Backend.restaurant.Restaurant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author viral
 */
public class Airport
{
    private String airportName;
    private List<Terminal> terminals;
    private Map<Integer, Integer> terminalGate;
    private String username;
    private List<Restaurant> restaurants;

    public Airport() {
        terminals = new ArrayList();
        terminalGate = new HashMap();
        restaurants = new ArrayList();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Map<Integer, Integer> getTerminalGate() {
        return terminalGate;
    }

    public void setTerminalGate(Map<Integer, Integer> terminalGate) {
        this.terminalGate = terminalGate;
    }
    
    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public List<Terminal> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<Terminal> terminals) {
        this.terminals = terminals;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
}
