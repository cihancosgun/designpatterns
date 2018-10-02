/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nullobjectpattern.factories;

import nullobjectpattern.abstracts.AbstractCustomer;
import nullobjectpattern.customers.NullCustomer;
import nullobjectpattern.customers.RealCustomer;

/**
 *
 * @author cihan
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
