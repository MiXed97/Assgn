/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

/**
 *
 * @author Mixed_97
 */
public class Delivery {

    //get info from customer
    String deliveryID;
    Customer customer;
    String status;
    ArrayListInterface<Order> order = new ArrList<>();
    DeliveryMen deliveryMen;
    

    public Delivery(){}
    
    public Delivery(String deliveryID, Customer customer, String status, ArrayListInterface<Order> order, DeliveryMen deliveryMen){
        this.deliveryID = deliveryID;
        this.customer= customer;
        this.status = status;
        this.order = order;
        this.deliveryMen = deliveryMen;
    }
    
    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayListInterface<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayListInterface<Order> order) {
        this.order = order;
    }
    
    public DeliveryMen getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(DeliveryMen deliveryMen) {
        this.deliveryMen = deliveryMen;
    }
    
}
