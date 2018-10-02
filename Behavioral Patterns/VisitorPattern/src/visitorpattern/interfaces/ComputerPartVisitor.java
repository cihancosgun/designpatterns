/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorpattern.interfaces;

import visitorpattern.computer.Computer;
import visitorpattern.computerparts.Keyboard;
import visitorpattern.computerparts.Monitor;
import visitorpattern.computerparts.Mouse;

/**
 *
 * @author cihan
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
