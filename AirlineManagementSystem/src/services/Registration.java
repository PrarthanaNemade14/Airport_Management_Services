///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package services;
//
//import java.util.ArrayList;
//import java.util.List;
//import model.User;
//
///**
// *
// * @author mamthashetty
// */
//public class Registration {
//    
//    List<User> user;
//
//    public Registration() {
//        user = new ArrayList<>();
//    }
//
//    public List<User> getCustomers() {
//        return user;
//    }
//
//    public void setCustomers(List<User> customers) {
//        this.user = customers;
//    }
//    
//    public User addUser()
//    {
//        User customer = new Customer();
//        customers.add(customer);
//        return customer;
//    }
//    
//    public void deleteCustomerByUsername(String username)
//    {
//        if(username == null || "".equals(username.trim()))
//            return;
//        for(Customer customer : customers) {
//            if(customer.getUsername().equals(username)) {
//                customers.remove(customer);
//                return;
//            }
//        }
//}
