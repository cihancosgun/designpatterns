/*
Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of objects using different criteria and chaining them in a decoupled way through logical operations. 
This type of design pattern comes under structural pattern as this pattern combines multiple criteria to obtain single criteria.


Filtre deseni veya Ölçüt kalıbı, geliştiricilerin farklı ölçütler kullanarak bir nesneler kümesini filtrelemelerini ve mantıksal işlemler yoluyla onları ayrıştırılmış şekilde zincirlemelerini sağlayan bir tasarım kalıbıdır.
Bu tasarım deseni, bu model tek kriter elde etmek için birden çok kriteri birleştirdiği için yapısal model altında gelir.
 */
package filterpattern;

import filterpattern.criterias.AndCriteria;
import filterpattern.criterias.CriteriaFemale;
import filterpattern.criterias.CriteriaMale;
import filterpattern.criterias.CriteriaSingle;
import filterpattern.criterias.OrCriteria;
import filterpattern.interfaces.Criteria;
import filterpattern.person.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
