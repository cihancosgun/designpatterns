/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterpattern.interfaces;

import filterpattern.person.Person;
import java.util.List;

/**
 *
 * @author cihan
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
