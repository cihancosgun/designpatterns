/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filterpattern.criterias;

import filterpattern.interfaces.Criteria;
import filterpattern.person.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cihan
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
