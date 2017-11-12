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
public class Delivery implements DeliveryInterface{

    //get info from customer
    String deliveryID;
    Customer customer;
    String status;
    Order order;
    DeliveryMen deliveryMen;
    int curr = 1;

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public DeliveryMen getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(DeliveryMen deliveryMen) {
        this.deliveryMen = deliveryMen;
    }
    
    @Override
    public int jobAssign(int size) {
        int result = curr;
        if(curr!= size)
            curr++;
        else
            curr=1;
        return result;
    }
    
    @Override
    public void createDelivery(Customer customer,String status,Order order, DeliveryMen deliverymen){
        
        this.customer = customer;
        this.status="No yet deliver";
        this.order = order;
        this.deliveryMen = deliveryMen;
        
    }
    
}
