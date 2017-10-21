/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author xiaoMming
 */
public class Market {

    private ArrayList<Order> orderList;
    private ArrayList<Person> personList;

    public ArrayList<Order> getOrderList() {
        ArrayList<Order> tempArr = new ArrayList<Order>();
        for (Person p : personList) {
            for (Order order : p.getOrderList()) {
                tempArr.add(order);
            }
        }
        orderList = tempArr;
        return orderList;
    }
}
