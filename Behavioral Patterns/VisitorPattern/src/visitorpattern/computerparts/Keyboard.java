/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern.computerparts;

import visitorpattern.interfaces.ComputerPart;
import visitorpattern.interfaces.ComputerPartVisitor;

/**
 *
 * @author cihan
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
