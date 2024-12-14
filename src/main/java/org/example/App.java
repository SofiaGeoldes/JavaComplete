package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Create TreeSets sorted by Name & by Age
        TreeSet<Person> sortedNameSet = new TreeSet<>(new CompareByName());

        sortedNameSet.add(new Person ("Remus", 28));
        sortedNameSet.add(new Person ("Raluca", 22));
        sortedNameSet.add(new Person ("Anemona", 18));
        sortedNameSet.add(new Person ("Darius", 45));
        sortedNameSet.add(new Person ("Pavel", 60));

       TreeSet<Person> sortedAgeSet = new TreeSet<>(new CompareByAge());

        sortedAgeSet.add(new Person ("Remus", 28));
        sortedAgeSet.add(new Person ("Raluca", 22));
        sortedAgeSet.add(new Person ("Anemona", 18));
        sortedAgeSet.add(new Person ("Darius", 45));
        sortedAgeSet.add(new Person ("Pavel", 60));

        //Using the for loop to iterate and print the treeSet sorted by Name
        System.out.println("Name\tAge");
        for(Person person : sortedNameSet) {
            System.out.println(person.getName() + "\t" + person.getAge());
        }

       //Using a for loop to iterate and print the treeSet sorted by Age
        System.out.println("Age\tName");
        for(Person person : sortedAgeSet){
            System.out.println(person.getAge() + "\t" + person.getName());
        }

        //Creating countries and address
        Country spain = new Country("Spain");
        Address address1 = new Address("Barcelona", spain);
        Country italy = new Country("Italy");
        Address address2 = new Address("Florence", italy);
        Country usa = new Country("usa");
        Address address3 = new Address("New York", usa);
        Country greece = new Country("Greece");
        Address address4 = new Address("Creta", greece);

        List<Address> addresses = new ArrayList<Address>();
        addresses.add(address1);
        addresses.add(address2);
        addresses.add(address3);
        addresses.add(address4);

        Hobby hobby1 = new Hobby("Dancing", 5, addresses);
        Hobby hobby2= new Hobby("Cooking", 2,addresses);
        Hobby hobby3 = new Hobby("Fishing", 4,addresses);
        Hobby hobby4 = new Hobby("Golf", 7,addresses);

        List<Hobby> hobbies = new ArrayList<Hobby>();
        hobbies.add(hobby1);
        hobbies.add(hobby2);
        hobbies.add(hobby3);
        hobbies.add(hobby4);

        Person person1 = new Person("Anemona", 18);
        HashMap<Person, List<Hobby>> personHobbies = new HashMap<>();
        personHobbies.put(person1, hobbies);

        Person person2 = new Person("Darius", 45);
        HashMap<Person, List<Hobby>> personHobbies1 = new HashMap<>();
        personHobbies.put(person2, hobbies);

        Person person3 = new Person("Pavel", 60);
        HashMap<Person, List<Hobby>> personHobbies2 =  new HashMap<>();
        personHobbies.put(person3, hobbies);

        for(Map.Entry<Person, List<Hobby>> entry : personHobbies.entrySet()) {
            Person p = entry.getKey();
            System.out.println(p.getName() + " 's hobbies: ");
            for(Hobby h : entry.getValue()) {
                System.out.println("- " + h.hobbyName + " practiced " + h.frequency + " times a week " + h.addresses.get(1).country.name);
            }
        }
    }
}
