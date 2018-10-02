/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern.interfaces;

import statepattern.context.Context;

/**
 *
 * @author cihan
 */
public interface State {

    public void doAction(Context context);
}
