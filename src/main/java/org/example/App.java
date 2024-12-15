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
        //Create TreeSets sorted by Name and add Persons to be sorted
        TreeSet<Person> sortedNameSet = new TreeSet<>(new CompareByName());

        sortedNameSet.add(new Person ("Remus", 28));
        sortedNameSet.add(new Person ("Raluca", 22));
        sortedNameSet.add(new Person ("Anemona", 18));
        sortedNameSet.add(new Person ("Darius", 45));
        sortedNameSet.add(new Person ("Pavel", 60));

        //Create TreeSet sorted by Age and add Persons to be sorted
        TreeSet<Person> sortedAgeSet = new TreeSet<>(new CompareByAge());

        sortedAgeSet.add(new Person ("Remus", 28));
        sortedAgeSet.add(new Person ("Raluca", 22));
        sortedAgeSet.add(new Person ("Anemona", 18));
        sortedAgeSet.add(new Person ("Darius", 45));
        sortedAgeSet.add(new Person ("Pavel", 60));

        //Using the for loop to iterate and print the treeSet sorted by Name
        System.out.println("\t");
        System.out.println("Sort the list of Persons by Name");
        System.out.println("\t");
        System.out.println("Name\tAge");
        for(Person person : sortedNameSet) {
            System.out.println(person.getName() + "\t" + person.getAge());
        }

       //Using a for loop to iterate and print the treeSet sorted by Age
        System.out.println("\t");
        System.out.println("Sort the list of Persons by Age");
        System.out.println("\t");
        System.out.println("Name\tAge");
        System.out.println("\t");
        for(Person person : sortedAgeSet){
            System.out.println(person.getName() + "\t" + person.getAge());
        }

        //Creating countries and addresses
        Country spain = new Country("Spain");
        Address barcelona = new Address("Barcelona", spain);
        Country italy = new Country("Italy");
        Address florence = new Address("Florence", italy);
        Country usa = new Country("USA");
        Address newYork = new Address("New York", usa);
        Country greece = new Country("Greece");
        Address atena = new Address("Atena", greece);

        //Creating Hobbies
        Hobby dancing = new Hobby("Dancing", 5,Arrays.asList(barcelona, atena));
        Hobby cooking = new Hobby("Cooking", 2,Arrays.asList(florence));
        Hobby fishing = new Hobby("Fishing", 4,Arrays.asList(atena, newYork, barcelona));
        Hobby golfing = new Hobby("Golf", 7, Collections.singletonList(atena));

        //Adding them to the list of Hobbies
        ArrayList<Hobby> hobbies = new ArrayList<Hobby>();
        hobbies.add(dancing);
        hobbies.add(cooking);
        hobbies.add(fishing);
        hobbies.add(golfing);

        //Linking each Person to the hobbies list using a HashMap
        HashMap<Person, List<Hobby>> personHobbies = new HashMap<>();
        Person person1 = new Person("Anemona", 18);
        personHobbies.put(person1, Arrays.asList(dancing, cooking));

        Person person2 = new Person("Darius", 45);
        personHobbies.put(person2, Arrays.asList(fishing, golfing, dancing));

        Person person3 = new Person("Pavel", 60);
        personHobbies.put(person3, Arrays.asList(fishing, golfing));

        Person person4 = new Person("Remus", 28);
        personHobbies.put(person4, hobbies);

        Person person5 = new Person("Raluca", 22);
        personHobbies.put(person5, Arrays.asList(fishing, cooking, golfing));

        //Get the list of hobbies and their countries for every person
        for(Map.Entry<Person, List<Hobby>> entry : personHobbies.entrySet()) {
            Person person = entry.getKey();
            System.out.println("\t");
            System.out.println(person.getName() + " 's hobbies: ");
            for(Hobby h : entry.getValue()) {
                System.out.println("- " + h.hobbyName + " practiced " + h.frequency + " times a week in " + h.addresses.get(0).address + ", " + h.addresses.get(0).country.name);
                }
            }
        }
    }

