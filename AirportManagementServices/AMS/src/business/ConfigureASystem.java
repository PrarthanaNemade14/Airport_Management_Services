package business;

import business.airline.Airline;
import business.airport.Airport;
import business.customer.Customer;
import business.employee.AirlineEmployee;
import business.userAccount.UserAccount;
import business.util.Constant;
import business.util.Role;

/**
 *
 * @author viral
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        system.getUserAccountDirectory().createUserAccount("admin", "admin", Role.adminRole);
        Role.getInstance().addNewUserRole("admin", Role.adminRole);
        
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("as", "as", Role.customerRole);
//        
//        Airline airline = system.getAirlineDirectory().addAirline();
//        airline.setUsername("airline");
//        airline.setName("Kingfisher");
//        system.getUserAccountDirectory().createUserAccount("airline", "airline", Role.airlineRole);
//        Role.getInstance().addNewUserRole("airline", Role.airlineRole);
//        Airport airport = system.getAirportDirectory().addAirport();
//        airport.setUsername("mumbai username");
//        airport.setAirportName("Mumbai airport");
//        
//        airport = system.getAirportDirectory().addAirport();
//        airport.setUsername("delhi username");
//        airport.setAirportName("Delhi airport");
//        
//        
        return system;
    }
    
}
