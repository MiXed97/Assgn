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
public interface DeliveryInterface {
    
    public int jobAssign(int size);
    public void createDelivery(Customer customer,String status,Order order, DeliveryMen deliverymen);
}
