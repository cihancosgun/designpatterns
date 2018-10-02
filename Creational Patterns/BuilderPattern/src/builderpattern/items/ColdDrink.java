/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern.items;

import builderpattern.interfaces.Item;
import builderpattern.interfaces.Packing;
import builderpattern.packings.Bottle;

/**
 *
 * @author cihan
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
